package com.iiht.onlineBookReselling.dao;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiht.onlineBookReselling.model.Book;

public class HiberConfig {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		//load properties file
		p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("hibernate.properties"));
		Configuration cfg=new Configuration();
		cfg.setProperties(p);
	
		cfg.addAnnotatedClass(Book.class);
	    //creating session factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	    System.out.println(session.isConnected());
	     String qstmt="from Book";
	       Query query=session.createQuery(qstmt);
	     List<Book> dlist=query.list();
		 for(Book dep:dlist)
			System.out.println(dep);
	    
	 // close session
	 session.close();
	 System.out.println(session.isConnected());
	    

	}

}
