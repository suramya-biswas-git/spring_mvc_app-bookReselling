package com.iiht.onlineBookReselling.config;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class HibernateConfiguration {
	public static SessionFactory getConfig(Class myClass) throws Exception{
		Properties p = new Properties();
		//load properties file
		p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("hibernate.properties"));
		Configuration cfg=new Configuration();
		cfg.setProperties(p);
	
		cfg.addAnnotatedClass(myClass);
	    //creating session factory object  
	    SessionFactory factory=cfg.buildSessionFactory(); 
	    return factory;
		
	}

}
