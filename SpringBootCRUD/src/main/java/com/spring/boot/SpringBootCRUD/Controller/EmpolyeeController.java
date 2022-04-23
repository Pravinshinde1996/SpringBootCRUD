package com.spring.boot.SpringBootCRUD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spring.boot.SpringBootCRUD.Entity.Empolyee;
import com.spring.boot.SpringBootCRUD.Service.EmployeeService;

@RestController
public class EmpolyeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmployeeData")
	String saveEmployeeData(@RequestBody Empolyee employee) throws JsonProcessingException {
		String returnValue=null;
		returnValue=this.employeeService.saveEmployeeData(employee);
		return returnValue;
	}
	
	@GetMapping("/getEmployeeData")
	String saveEmployeeData() throws JsonProcessingException {
		String returnValue=null;
		returnValue=this.employeeService.getEmployeeData();
		return returnValue;
	}
	
}
