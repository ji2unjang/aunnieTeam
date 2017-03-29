package com.aunnie.dresser.dto;

public class ReviewDTO {
	private int review_no;
	private int member_no;
	private int product_no;
	private int r_type;
	private String r_title;
	private String r_contents;
	private int score;
	
	public ReviewDTO() {

	}
	
	public ReviewDTO(int review_no, int member_no, int product_no, int r_type, String r_title, String r_contents,
			int score) {
		super();
		this.review_no = review_no;
		this.member_no = member_no;
		this.product_no = product_no;
		this.r_type = r_type;
		this.r_title = r_title;
		this.r_contents = r_contents;
		this.score = score;
	}
	public int getReview_no() {
		return review_no;
	}
	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	public int getR_type() {
		return r_type;
	}
	public void setR_type(int r_type) {
		this.r_type = r_type;
	}
	public String getR_title() {
		return r_title;
	}
	public void setR_title(String r_title) {
		this.r_title = r_title;
	}
	public String getR_contents() {
		return r_contents;
	}
	public void setR_contents(String r_contents) {
		this.r_contents = r_contents;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
