package com.iiht.onlineBookReselling.dao;

import java.util.List;

import com.iiht.onlineBookReselling.model.BookOrder;

public interface BookOrderDao {
	public List<Integer> generateOrderId() throws Exception;
	public void save(BookOrder bookOrder) throws Exception;

}
