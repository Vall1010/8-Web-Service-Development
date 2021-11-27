package com.montrealcollege.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.montrealcollege.employee.CreateResponse;
import com.montrealcollege.employee.Employee;

@Endpoint
public class EmployeeEndpoint {

	private static final String NAMESPACE_URI = "http://www.montrealcollege.com/employee";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "Employee")
	@ResponsePayload
	public CreateResponse createEmployee(@RequestPayload Employee employee) throws Exception {
		CreateResponse response = new CreateResponse();
		response.setResponse("New Employee created: " + employee.getFirstName() + " " + employee.getLastName()
				+ " Salary: $" + employee.getSalary());
		return response;
	}

}
