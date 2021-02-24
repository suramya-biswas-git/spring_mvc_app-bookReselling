package com.iiht.onlineBookReselling.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "BOOK_ORDER")   
public class BookOrder {
	@Id
	@Column(name="ORDER_ID")
	private Integer orderId;
	@Column(name="USER_ID")
	private Integer userId;
	@Column(name="BOOK_ID")
	private Integer bookId;
	@Column(name="ORDER_AMOUNT")
	private Double orderAmount;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public BookOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookOrder(Integer orderId, Integer userId, Integer bookId, Double orderAmount) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.bookId = bookId;
		this.orderAmount = orderAmount;
	}
	

}
