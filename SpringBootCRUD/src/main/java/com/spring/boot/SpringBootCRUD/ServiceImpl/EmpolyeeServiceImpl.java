package com.spring.boot.SpringBootCRUD.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.spring.boot.SpringBootCRUD.Entity.Empolyee;
import com.spring.boot.SpringBootCRUD.Repository.EmpolyeeRepository;
import com.spring.boot.SpringBootCRUD.Service.EmployeeService;

@Service
public class EmpolyeeServiceImpl implements EmployeeService {
	
	static final ObjectMapper MAPPER=new ObjectMapper();
	
	@Autowired
	EmpolyeeRepository empolyeeRepository;
	
	@Override
	public String saveEmployeeData(Empolyee empolyee) throws JsonProcessingException {
		String returnValue=null;
		ObjectNode response=MAPPER.createObjectNode();
		Empolyee e=empolyeeRepository.save(empolyee);
		if(e!=null) {
			response.put("responseStatus", "200");
			response.put("responseMsg", "data save successfully....!");
		}else {
			response.put("responseStatus", "200");
			response.put("responseMsg", "error in save the data...!");
		}
		returnValue=MAPPER.writeValueAsString(response);
		return returnValue;
	}

	@Override
	public String getEmployeeData() throws JsonProcessingException {
		String returnValue=null;
		ArrayNode arrayOfEmpData=MAPPER.createArrayNode();
		ObjectNode response=MAPPER.createObjectNode();
		List<Empolyee> list=empolyeeRepository.findAll();
		if(list!=null && list.size()>0) {
			for (Empolyee empolyee : list) {
				ObjectNode employeeObj=MAPPER.createObjectNode();
				employeeObj.put("empName", empolyee.getEmpName());
				employeeObj.put("empAge", empolyee.getEmpAge());
				employeeObj.put("empSal", empolyee.getEmpSal());
				employeeObj.put("empDept", empolyee.getEmpDept());
				employeeObj.put("empEmailid", empolyee.getEmpEmailid());
				employeeObj.put("empPhno", empolyee.getEmpPhno());
				arrayOfEmpData.add(employeeObj);
			}
			response.put("responseStatus", "200");
			response.set("responseMsg", arrayOfEmpData);
		}else {
			response.put("responseStatus", "200");
			response.put("responseMsg", "No data found");
		}
		
		returnValue=MAPPER.writeValueAsString(response);
		
		return returnValue;
	}

	@Override
	public String getEmployeeDataByEmpName(String empName) throws JsonProcessingException {
		String returnValue=null;
		ArrayNode arrayOfEmpData=MAPPER.createArrayNode();
		ObjectNode response=MAPPER.createObjectNode();
		List<Empolyee> list=this.empolyeeRepository.findByEmpNameIgnoreCase(empName);
		
		if(list!=null && list.size()>0) {
			for (Empolyee empolyee : list) {
				ObjectNode employeeObj=MAPPER.createObjectNode();
				employeeObj.put("empName", empolyee.getEmpName());
				employeeObj.put("empAge", empolyee.getEmpAge());
				employeeObj.put("empSal", empolyee.getEmpSal());
				employeeObj.put("empDept", empolyee.getEmpDept());
				employeeObj.put("empEmailid", empolyee.getEmpEmailid());
				employeeObj.put("empPhno", empolyee.getEmpPhno());
				arrayOfEmpData.add(employeeObj);
			}
			response.put("responseStatus", "200");
			response.set("responseMsg", arrayOfEmpData);
		}else {
			response.put("responseStatus", "200");
			response.put("responseMsg", "No data found");
		}
		
		returnValue=MAPPER.writeValueAsString(response);
		
		return returnValue;
	}

}
