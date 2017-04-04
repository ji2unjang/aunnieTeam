package com.aunnie.web.dto;

public class ProductDTO {
	private int product_no;
	private int avg_score;
	private String p_name;
	private String description;
	private String ingredient;
	private String brand_name;
	private String company;
	private String producer;
	private String p_date;
	private int type_no;
	private String e_code;//event code
	
	public ProductDTO() {
		super();
	}
	
	public ProductDTO(int product_no, int avg_score, String p_name, String description, String ingredient,
			String brand_name, String company, String producer, String p_date, int type_no, String e_code) {
		super();
		this.product_no = product_no;
		this.avg_score = avg_score;
		this.p_name = p_name;
		this.description = description;
		this.ingredient = ingredient;
		this.brand_name = brand_name;
		this.company = company;
		this.producer = producer;
		this.p_date = p_date;
		this.type_no = type_no;
		this.e_code = e_code;
	}


	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public int getAvg_score() {
		return avg_score;
	}

	public void setAvg_score(int avg_score) {
		this.avg_score = avg_score;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getP_date() {
		return p_date;
	}

	public void setP_date(String p_date) {
		this.p_date = p_date;
	}

	public int getType_no() {
		return type_no;
	}

	public void setType_no(int type_no) {
		this.type_no = type_no;
	}

	public String getE_code() {
		return e_code;
	}

	public void setE_code(String e_code) {
		this.e_code = e_code;
	}
	
}
