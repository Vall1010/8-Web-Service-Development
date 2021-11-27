package com.montrealcollege.ws.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.montrealcollege.ws.client.generated.HelloResponse;
import com.montrealcollege.ws.client.service.ClientService;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientService service;

	@GetMapping("/call/{name}")
	public String callOperation(@PathVariable String name, ModelMap model) {
		HelloResponse responseObj = service.callWS(name);
		model.addAttribute("responseObject",responseObj);
		return "result";
	}
}
