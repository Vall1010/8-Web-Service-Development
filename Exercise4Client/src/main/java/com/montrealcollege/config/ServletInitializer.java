package com.montrealcollege.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WebServiceConfig.class);
		context.setServletContext(servletContext);	
		
		
		ServletRegistration.Dynamic servletRegistry = servletContext.addServlet("dispatcher-mvc", 
														new DispatcherServlet(context));
		servletRegistry.addMapping("/");
		servletRegistry.setLoadOnStartup(1);
		
	}

}
