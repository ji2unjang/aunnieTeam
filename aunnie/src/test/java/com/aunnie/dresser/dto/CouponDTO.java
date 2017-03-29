package com.aunnie.dresser.dto;

import java.util.Date;

public class CouponDTO {
	private int coupon_no;
	private char coupon_type;
	private int coupon_title;
	private int discount;
	private int min_price;
	private int max_price;
	private int mas_quantity;
	private Date start_date;
	private Date end_date;
	private String brand_name;
	private int type_no;
	
	public CouponDTO() {
		
	}
	
	public CouponDTO(int coupon_no, char coupon_type, int coupon_title, int discount, int min_price, int max_price,
			int mas_quantity, Date start_date, Date end_date, String brand_name, int type_no) {
		super();
		this.coupon_no = coupon_no;
		this.coupon_type = coupon_type;
		this.coupon_title = coupon_title;
		this.discount = discount;
		this.min_price = min_price;
		this.max_price = max_price;
		this.mas_quantity = mas_quantity;
		this.start_date = start_date;
		this.end_date = end_date;
		this.brand_name = brand_name;
		this.type_no = type_no;
	}
	public int getCoupon_no() {
		return coupon_no;
	}
	public void setCoupon_no(int coupon_no) {
		this.coupon_no = coupon_no;
	}
	public char getCoupon_type() {
		return coupon_type;
	}
	public void setCoupon_type(char coupon_type) {
		this.coupon_type = coupon_type;
	}
	public int getCoupon_title() {
		return coupon_title;
	}
	public void setCoupon_title(int coupon_title) {
		this.coupon_title = coupon_title;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getMin_price() {
		return min_price;
	}
	public void setMin_price(int min_price) {
		this.min_price = min_price;
	}
	public int getMax_price() {
		return max_price;
	}
	public void setMax_price(int max_price) {
		this.max_price = max_price;
	}
	public int getMas_quantity() {
		return mas_quantity;
	}
	public void setMas_quantity(int mas_quantity) {
		this.mas_quantity = mas_quantity;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public int getType_no() {
		return type_no;
	}
	public void setType_no(int type_no) {
		this.type_no = type_no;
	}
	
	

}
