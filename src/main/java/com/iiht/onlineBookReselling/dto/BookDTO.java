package com.iiht.onlineBookReselling.dto;

public class BookDTO {
	
	private Integer bookId;
	private String bookName;
	private String author;
	private String description;
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
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDTO(Integer bookId, String bookName, String author, String description, Double price) {
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
