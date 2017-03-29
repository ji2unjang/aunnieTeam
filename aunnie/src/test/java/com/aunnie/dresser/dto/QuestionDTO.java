package com.aunnie.dresser.dto;

public class QuestionDTO {
	private int q_no;
	private String q_type;
	private String q_date;
	private String q_contents;
	private String a_contents;
	private String a_date;
	private int product_no;
	private int member_no;
	private int order_no;
	
	public QuestionDTO() {

	}
	
	public QuestionDTO(int q_no, String q_type, String q_date, String q_contents, String a_contents, String a_date,
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
	
	
}
