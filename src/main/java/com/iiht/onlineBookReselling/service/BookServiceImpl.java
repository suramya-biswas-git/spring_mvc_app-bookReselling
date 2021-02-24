package com.iiht.onlineBookReselling.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iiht.onlineBookReselling.dao.BookDao;
import com.iiht.onlineBookReselling.dto.BookDTO;
import com.iiht.onlineBookReselling.model.Book;
@Service 
@Transactional
@Component
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	public List<BookDTO> showAllBooks() throws Exception {
		
		List<Book> bookList=bookDao.showAllBooks();
	
		List<BookDTO> bookDTOList=new ArrayList<BookDTO>();
		for(Book book:bookList){
			
			BookDTO bookDTO=new BookDTO(book.getBookId(),book.getBookName(),book.getAuthor(),book.getDescription(),book.getPrice());
			bookDTOList.add(bookDTO);
		}
		return bookDTOList;
	}
	
	public BookDTO showBookDetails(int id) throws Exception{
		List<Book> bookList=bookDao.showBookDetails(id);
		BookDTO bookDTO=null;
		for(Book book:bookList){
			 bookDTO=new BookDTO(book.getBookId(),book.getBookName(),book.getAuthor(),book.getDescription(),book.getPrice());
		}
		return bookDTO;
		
	}

}
