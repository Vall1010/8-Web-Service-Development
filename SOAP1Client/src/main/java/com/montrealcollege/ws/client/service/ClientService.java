package com.montrealcollege.ws.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montrealcollege.ws.client.generated.Hello;
import com.montrealcollege.ws.client.generated.HelloRequest;
import com.montrealcollege.ws.client.generated.HelloResponse;

@Service
public class ClientService {
	
	@Autowired
	private Hello port;

	public HelloResponse callWS(String name) {
		HelloRequest request = new HelloRequest();
		request.setName(name);
		
		return port.hello(request);
	}
}
