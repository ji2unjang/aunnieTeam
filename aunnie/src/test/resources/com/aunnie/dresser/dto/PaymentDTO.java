package com.aunnie.dresser.dto;

import java.util.Date;

public class PaymentDTO {
	private int payment_no;
	private Date payment_date; 
	private int payment_pay;
	private String payment_type;
	private int order_no;
	
	public PaymentDTO() {
		super();
	}
	
	public PaymentDTO(int payment_no, Date payment_date, int payment_pay, String payment_type, int order_no) {
		super();
		this.payment_no = payment_no;
		this.payment_date = payment_date;
		this.payment_pay = payment_pay;
		this.payment_type = payment_type;
		this.order_no = order_no;
	}

	public int getPayment_no() {
		return payment_no;
	}

	public void setPayment_no(int payment_no) {
		this.payment_no = payment_no;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public int getPayment_pay() {
		return payment_pay;
	}

	public void setPayment_pay(int payment_pay) {
		this.payment_pay = payment_pay;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	
	
	
	
	
}
