package com.montrealcollege.exercise1ws.endpoint;

import org.example.hello.HelloRequest;
import org.example.hello.HelloResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HelloEndpoint {

    private static final String NAMESPACE_URI = "http://www.example.org/hello";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "HelloRequest")
    @ResponsePayload
    public HelloResponse handleHelloRequest(@RequestPayload HelloRequest helloRequest) throws Exception {
        HelloResponse response = new HelloResponse();
        response.setResponse("Hello World!!" + helloRequest.getName());
        return response;
    }

}
