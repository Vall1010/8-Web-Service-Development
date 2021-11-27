package com.montrealcollege.clientspringws;

import com.montrealcollege.ws.client.generated.Hello;
import com.montrealcollege.ws.client.generated.HelloRequest;
import com.montrealcollege.ws.client.generated.HelloResponse;
import com.montrealcollege.ws.client.generated.HelloService;


public class TestClient {
    
    public static void main(String... args) {
        HelloService service = new HelloService();
        Hello port = service.getHelloSoap11();
        
        HelloRequest request = new HelloRequest();
        request.setName("John");
        HelloResponse response = port.hello(request);
        System.out.println(response.getResponse());
    }

}
