package com.iiht.onlineBookReselling.dao;

import java.util.List;

import com.iiht.onlineBookReselling.model.Book;

public interface BookDao {
	public List<Book> showAllBooks() throws Exception;
	public  List<Book>showBookDetails(int id) throws Exception;

}
