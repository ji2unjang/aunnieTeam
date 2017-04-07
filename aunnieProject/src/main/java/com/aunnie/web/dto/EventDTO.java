package com.aunnie.web.dto;

import java.util.Date;

public class EventDTO {
	private int e_code;
	private String e_name;
	private int discount;
	private Date start_date;
	private Date end_date;
	
	public EventDTO() {
		
	}
	
	public EventDTO(int e_code, String e_name, int discount, Date start_date, Date end_date) {
		super();
		this.e_code = e_code;
		this.e_name = e_name;
		this.discount = discount;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	
	public int getE_code() {
		return e_code;
	}
	public void setE_code(int e_code) {
		this.e_code = e_code;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
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
	
	
}
