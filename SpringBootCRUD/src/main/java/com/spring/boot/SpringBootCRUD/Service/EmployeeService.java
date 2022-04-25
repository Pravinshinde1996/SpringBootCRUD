package com.spring.boot.SpringBootCRUD.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spring.boot.SpringBootCRUD.Entity.Empolyee;


public interface EmployeeService {
	
	//Save Operation
	String saveEmployeeData(Empolyee empolyee) throws JsonProcessingException;
	
	//Get Operation
	String getEmployeeData() throws JsonProcessingException;
	
	//Find Employee name
	String getEmployeeDataByEmpName(String empName) throws JsonProcessingException;
}
