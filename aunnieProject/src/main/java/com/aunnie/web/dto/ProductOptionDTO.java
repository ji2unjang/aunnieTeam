package com.aunnie.web.dto;

public class ProductOptionDTO {
	
	private int product_no;
	private int option_no;
	private String option_name;
	private int option_price;
	private int option_quantity;
	private String option_volume;
	
	public ProductOptionDTO() {
		super();
	}
	public ProductOptionDTO(int product_no, int option_no, String option_name, int option_price, int option_quantity,
			String option_volume) {
		super();
		this.product_no = product_no;
		this.option_no = option_no;
		this.option_name = option_name;
		this.option_price = option_price;
		this.option_quantity = option_quantity;
		this.option_volume = option_volume;
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
	public String getOption_name() {
		return option_name;
	}
	public void setOption_name(String option_name) {
		this.option_name = option_name;
	}
	public int getOption_price() {
		return option_price;
	}
	public void setOption_price(int option_price) {
		this.option_price = option_price;
	}
	public int getOption_quantity() {
		return option_quantity;
	}
	public void setOption_quantity(int option_quantity) {
		this.option_quantity = option_quantity;
	}
	public String getOption_volume() {
		return option_volume;
	}
	public void setOption_volume(String option_volume) {
		this.option_volume = option_volume;
	}
	
	
}
