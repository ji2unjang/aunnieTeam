package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.ProductOptionDAO;
import com.aunnie.web.dto.ProductOptionDTO;

@Service("productOptionService")
public class ProductOptionServiceImple implements ProductOptionService{
	@Resource(name="productOptionDAO")
	private ProductOptionDAO dao;

	@Override
	public List<ProductOptionDTO> getAll() {
		return dao.selectAll();
	}

	@Override
	public ProductOptionDTO readOne(int ono) {
		return dao.selectOne(ono);
	}

	@Override
	public void writeOne(ProductOptionDTO dto) {
		dao.insertOne(dto);
	}

	@Override
	public void modifyOne(ProductOptionDTO dto) {
		dao.updateOne(dto);
	}

	@Override
	public void removeOne(int ono) {
		dao.deleteOne(ono);
	}
	
	
}
