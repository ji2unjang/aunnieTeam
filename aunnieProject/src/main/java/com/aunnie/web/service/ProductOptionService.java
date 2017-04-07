package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.ProductOptionDTO;

public interface ProductOptionService {
	public List<ProductOptionDTO> getAll();
	public ProductOptionDTO readOne(int ono);
	public void writeOne(ProductOptionDTO dto);
	public void modifyOne(ProductOptionDTO dto);
	public void removeOne(int ono);
}
