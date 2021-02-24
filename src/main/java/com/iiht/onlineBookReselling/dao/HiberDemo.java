package com.iiht.onlineBookReselling.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.iiht.onlineBookReselling.config.HibernateConfiguration;
import com.iiht.onlineBookReselling.model.Book;

public class HiberDemo {

	public static void main(String[] args) throws Exception {
		 SessionFactory factory=HibernateConfiguration.getConfig(Book.class) ;
	      
		    //creating session object  
		    Session session=factory.openSession();  
		    System.out.println(session.isConnected());
		    int id=1002;
		     String qstmt="from Book where bookId="+id;
		       Query query=session.createQuery(qstmt);
		     List<Book> dlist=query.list();
			 for(Book dep:dlist)
				System.out.println(dep);
		    
		 // close session
		 session.close();
		 System.out.println("-------------------");
		 for(Book dep:dlist)
				System.out.println(dep);
		 System.out.println(session.isConnected());

	}

}
