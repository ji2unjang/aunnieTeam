package com.aunnie.web.dto;

import java.util.Date;

public class OrderDTO {
	private int order_no;
	private Date order_date;
	private String order_status;
	private int used_mileage;
	private int member_no;
	private int coupon_no;
	
	public OrderDTO() {
		super();
	}
	public OrderDTO(int order_no, Date order_date, String order_status, int used_mileage, int member_no,
			int coupon_no) {
		super();
		this.order_no = order_no;
		this.order_date = order_date;
		this.order_status = order_status;
		this.used_mileage = used_mileage;
		this.member_no = member_no;
		this.coupon_no = coupon_no;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public int getUsed_mileage() {
		return used_mileage;
	}
	public void setUsed_mileage(int used_mileage) {
		this.used_mileage = used_mileage;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public int getCoupon_no() {
		return coupon_no;
	}
	public void setCoupon_no(int coupon_no) {
		this.coupon_no = coupon_no;
	}
	
	
}
