package com.iiht.onlineBookReselling.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
@Configuration
public class WebServletConfiguration implements WebApplicationInitializer  {
	public void onStartup (ServletContext servletContext) throws ServletException 
    {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(MvcSpringConfiguration.class);
		context.setServletContext(servletContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet",new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}


}
