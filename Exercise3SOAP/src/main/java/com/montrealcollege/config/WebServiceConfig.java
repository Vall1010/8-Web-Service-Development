package com.montrealcollege.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
@ComponentScan(basePackages = "com.montrealcollege")
public class WebServiceConfig {
	
	@Bean
	public XsdSchema employeeSchema() {
		return new SimpleXsdSchema(new FileSystemResource("src/main/webapp/WEB-INF/employee.xsd"));
	}
	
	@Bean(name="employee")
	public DefaultWsdl11Definition wsdl11Definition(XsdSchema employeeSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("CreateEmployee");
		definition.setLocationUri("/createService/");
		definition.setTargetNamespace("http://www.montrealcollege.com/employee");	
		definition.setSchema(employeeSchema);
		return definition;
	}

}
