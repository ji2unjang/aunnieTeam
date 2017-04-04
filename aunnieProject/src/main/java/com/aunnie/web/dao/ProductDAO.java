package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.ProductDTO;

public interface ProductDAO {
	public List<ProductDTO> selectAll();
	public ProductDTO selectOne(int pno);
	public void insertOne(ProductDTO dto);
	public void updateOne(ProductDTO dto);
	public void deleteOne(int pno);
}
