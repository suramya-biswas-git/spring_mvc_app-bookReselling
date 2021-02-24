package com.iiht.onlineBookReselling.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iiht.onlineBookReselling.config.HibernateConfiguration;
import com.iiht.onlineBookReselling.model.BookOrder;


@Service 
@Transactional
@Component
public class BookOrderImpl implements BookOrderDao {

	public List<Integer> generateOrderId() throws Exception {
		
		SessionFactory factory=HibernateConfiguration.getConfig(BookOrder.class) ;
	       Session session=factory.openSession();  
	        String qstmt="select max(orderId) from BookOrder";
	        Query query=session.createQuery(qstmt);
		     List<Integer> idList=query.list();
		return idList;
	}

	public void save(BookOrder bookOrder) throws Exception {
		SessionFactory factory=HibernateConfiguration.getConfig(BookOrder.class) ;
	       Session session=factory.openSession();  
	       Transaction tx = session.beginTransaction();
			session.save(bookOrder);
			tx.commit();
			session.close();
			factory.close();
	}
}
