package com.aunnie.web.dto;

public class OrderDetailDTO {
	private int order_no;
	private int product_no;
	private int option_no;
	private int p_amount;
	private String recipient;
	private String recipient_tel;
	private String shipp_address;
	private int order_detail_no;
	
	
	public OrderDetailDTO(int order_no, int product_no, int option_no, int p_amount, String recipient,
			String recipient_tel, String shipp_address, int order_detail_no) {
		super();
		this.order_no = order_no;
		this.product_no = product_no;
		this.option_no = option_no;
		this.p_amount = p_amount;
		this.recipient = recipient;
		this.recipient_tel = recipient_tel;
		this.shipp_address = shipp_address;
		this.order_detail_no = order_detail_no;
	}


	public OrderDetailDTO() {
		super();
	}


	public int getOrder_no() {
		return order_no;
	}


	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}


	public int getProduct_no() {
		return product_no;
	}


	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}


	public int getOption_no() {
		return option_no;
	}


	public void setOption_no(int option_no) {
		this.option_no = option_no;
	}


	public int getP_amount() {
		return p_amount;
	}


	public void setP_amount(int p_amount) {
		this.p_amount = p_amount;
	}


	public String getRecipient() {
		return recipient;
	}


	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}


	public String getRecipient_tel() {
		return recipient_tel;
	}


	public void setRecipient_tel(String recipient_tel) {
		this.recipient_tel = recipient_tel;
	}


	public String getShipp_address() {
		return shipp_address;
	}


	public void setShipp_address(String shipp_address) {
		this.shipp_address = shipp_address;
	}


	public int getOrder_detail_no() {
		return order_detail_no;
	}


	public void setOrder_detail_no(int order_detail_no) {
		this.order_detail_no = order_detail_no;
	}
	
	
	
	
}
