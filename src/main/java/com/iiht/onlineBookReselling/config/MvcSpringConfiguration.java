package com.iiht.onlineBookReselling.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.iiht.onlineBookReselling")
@PropertySource(value = { "classpath:hibernate.properties" })

public class MvcSpringConfiguration implements WebMvcConfigurer{ 
	@Autowired
    private Environment env;
//public class MvcSpringConfig extends WebMvcConfigurerAdapter{
	
	    @Bean
	    public ViewResolver viewResolver() 
	     {
	    	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/views/");
	        viewResolver.setSuffix(".jsp");
	        
	        return viewResolver;
	    }
	    @Override
	    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics/");
	    } 
}

// https://www.boraji.com/spring-mvc-5-static-resources-handling-example
