package com.montrealcollege.service;

import org.springframework.stereotype.Service;

import com.montrealcollege.ws.client.generated.CreateEmployee;
import com.montrealcollege.ws.client.generated.CreateEmployeeService;
import com.montrealcollege.ws.client.generated.CreateResponse;
import com.montrealcollege.ws.client.generated.Employee;

@Service
public class EmployeeService {
	
	public CreateResponse createEmployee(Employee emp) {
		CreateEmployeeService service = new CreateEmployeeService();
		CreateEmployee port = service.getCreateEmployeeSoap11();
		CreateResponse response = port.create(emp);
		return response;
	}

}
