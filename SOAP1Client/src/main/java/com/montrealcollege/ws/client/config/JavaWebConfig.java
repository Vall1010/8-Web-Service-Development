package com.montrealcollege.ws.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.montrealcollege.ws.client.generated.Hello;
import com.montrealcollege.ws.client.generated.HelloService;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.montrealcollege")
public class JavaWebConfig {
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public Hello helloPort() {
		HelloService service = new HelloService();
		Hello port = service.getHelloSoap11();
		return port;
	}

}
