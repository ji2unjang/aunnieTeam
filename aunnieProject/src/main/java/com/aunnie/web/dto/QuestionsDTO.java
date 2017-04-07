package com.aunnie.web.dto;

public class QuestionsDTO {
	private int q_no;
	private String q_type;
	private String q_date;
	private String q_contents;
	private String a_contents;
	private String a_date;
	private int product_no;
	private int member_no;
	private int order_no;
	
	public QuestionsDTO() {

	}
	
	public QuestionsDTO(int q_no, String q_type, String q_date, String q_contents, String a_contents, String a_date,
			int product_no, int member_no, int order_no) {
		super();
		this.q_no = q_no;
		this.q_type = q_type;
		this.q_date = q_date;
		this.q_contents = q_contents;
		this.a_contents = a_contents;
		this.a_date = a_date;
		this.product_no = product_no;
		this.member_no = member_no;
		this.order_no = order_no;
	}

	public int getQ_no() {
		return q_no;
	}

	public void setQ_no(int q_no) {
		this.q_no = q_no;
	}

	public String getQ_type() {
		return q_type;
	}

	public void setQ_type(String q_type) {
		this.q_type = q_type;
	}

	public String getQ_date() {
		return q_date;
	}

	public void setQ_date(String q_date) {
		this.q_date = q_date;
	}

	public String getQ_contents() {
		return q_contents;
	}

	public void setQ_contents(String q_contents) {
		this.q_contents = q_contents;
	}

	public String getA_contents() {
		return a_contents;
	}

	public void setA_contents(String a_contents) {
		this.a_contents = a_contents;
	}

	public String getA_date() {
		return a_date;
	}

	public void setA_date(String a_date) {
		this.a_date = a_date;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	
	
	
	
}
