package com.iiht.onlineBookReselling.dto;

public class BookOrderDTO {
	private Integer orderId;
	private Integer userId;
	private Integer bookId;
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
	public BookOrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookOrderDTO(Integer orderId, Integer userId, Integer bookId, Double orderAmount) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.bookId = bookId;
		this.orderAmount = orderAmount;
	}
	@Override
	public String toString() {
		return "BookOrder [orderId=" + orderId + ", userId=" + userId + ", bookId=" + bookId + ", orderAmount="
				+ orderAmount + "]";
	}


}
