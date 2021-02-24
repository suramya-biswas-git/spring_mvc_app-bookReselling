package com.iiht.onlineBookReselling.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iiht.onlineBookReselling.config.HibernateConfiguration;
import com.iiht.onlineBookReselling.model.Book;

@Service 
@Transactional
@Component
public class BookDaoImpl implements BookDao {

	public List<Book> showAllBooks() throws Exception {
		 SessionFactory factory=HibernateConfiguration.getConfig(Book.class) ;
		       Session session=factory.openSession();  
		        String qstmt="from Book";
		       Query query=session.createQuery(qstmt);
		     List<Book> bookList=query.list();
		     session.close();
			 return bookList;
	}
	public List<Book> showBookDetails(int id) throws Exception{
		SessionFactory factory=HibernateConfiguration.getConfig(Book.class) ;
	       Session session=factory.openSession();  
	        String qstmt="from Book where bookId="+id;
	        Query query=session.createQuery(qstmt);
		     List<Book> bookList=query.list();
	        return bookList;
		
	}

}
