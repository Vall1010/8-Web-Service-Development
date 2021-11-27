package com.montrealcollege.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.montrealcollege.service.EmployeeService;
import com.montrealcollege.ws.client.generated.CreateResponse;
import com.montrealcollege.ws.client.generated.Employee;

@Controller
@RequestMapping("/employee")
public class ClientController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/form")
	public String showForm(ModelMap model) {
		model.addAttribute("empl", new Employee());
		return "form";
	}
	
	@PostMapping("/createEmployee")
	public String createEmployee(@ModelAttribute Employee emp, ModelMap model) {
		CreateResponse response =  service.createEmployee(emp);
		model.addAttribute("responseObj", response);
		return "result";
	}
}
