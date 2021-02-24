package com.iiht.onlineBookReselling.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iiht.onlineBookReselling.dao.BookOrderDao;
import com.iiht.onlineBookReselling.dto.BookOrderDTO;
import com.iiht.onlineBookReselling.model.BookOrder;

@Service 
@Transactional
@Component
public class BookOrderServiceImpl implements BookOrderService {
	@Autowired
     BookOrderDao bookOrderDao;	
	public int generateOrderId() throws Exception {
		int id=0;
		List<Integer> idList= bookOrderDao.generateOrderId();
				
		try{
			for(int i:idList)
				id=i;
			id++;
		}catch(Exception ex){
			id=10000001;
		}
			return id;
	}

	public void save(BookOrderDTO bookOrderDTO) throws Exception {
		BookOrder bookOrder=new BookOrder(bookOrderDTO.getOrderId(), bookOrderDTO.getUserId(),bookOrderDTO.getBookId(),bookOrderDTO.getOrderAmount());
		bookOrderDao.save(bookOrder);

	}

}
