package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.ProductDTO;


public interface ProductService {
	public List<ProductDTO> getAll();
	public ProductDTO readOne(int pno);
	public void writeOne(ProductDTO dto);
	public void modifyOne(ProductDTO dto);
	public void removeOne(int pno);
}
