package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.ProductOptionDTO;

public interface ProductOptionDAO {
	public List<ProductOptionDTO> selectAll();
	public ProductOptionDTO selectOne(int ono);
	public void insertOne(ProductOptionDTO dto);
	public void updateOne(ProductOptionDTO dto);
	public void deleteOne(int ono);
}
