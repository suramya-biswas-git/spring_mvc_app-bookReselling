package com.iiht.onlineBookReselling.model;

import javax.persistence.*;

@Entity
@Table(name= "BOOK")   
public class Book {
	@Id
	@Column(name="BOOK_ID")
	private Integer bookId;
	@Column(name="BOOK_NAME")
	private String bookName;
	@Column(name="AUTHOR")
	private String author;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="PRICE")
	private Double price;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookId, String bookName, String author, String description, Double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.description = description;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", description="
				+ description + ", price=" + price + "]";
	}
	


}
