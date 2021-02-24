package com.iiht.onlineBookReselling.service;

import com.iiht.onlineBookReselling.dto.BookOrderDTO;
public interface BookOrderService {
	public int generateOrderId() throws Exception;
	public void save(BookOrderDTO bookOrder) throws Exception;
	
}
