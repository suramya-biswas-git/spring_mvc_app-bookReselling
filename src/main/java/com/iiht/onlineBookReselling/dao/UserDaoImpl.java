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
import com.iiht.onlineBookReselling.model.User;
@Service 
@Transactional
@Component
public class UserDaoImpl implements UserDao {

	public void save(User user) throws Exception {
		SessionFactory factory=HibernateConfiguration.getConfig(User.class) ;
	       Session session=factory.openSession();  
	       Transaction tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			session.close();
			factory.close();
	}

	public List<User> findUser(User user) throws Exception {
		SessionFactory factory=HibernateConfiguration.getConfig(User.class) ;
	       Session session=factory.openSession();  
	        String qstmt="from User u where u.userId="+user.getUserId()+" and u.password='"+user.getPassword()+"'";
	        Query query=session.createQuery(qstmt);
		     List<User> userList=query.list();
		     session.close();
	        return userList;
	}
	public List<Integer> generateId() throws Exception{
		SessionFactory factory=HibernateConfiguration.getConfig(User.class) ;
	       Session session=factory.openSession();  
	        String qstmt="select max(userId) from User";
	        Query query=session.createQuery(qstmt);
		     List<Integer> idList=query.list();
		return idList;
	}
}
