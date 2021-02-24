package com.iiht.onlineBookReselling.service;

import java.util.List;


import com.iiht.onlineBookReselling.dto.BookDTO;

public interface BookService {
	public List<BookDTO> showAllBooks() throws Exception;
	public BookDTO showBookDetails(int id) throws Exception;

}
