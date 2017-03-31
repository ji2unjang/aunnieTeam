package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.ProductDAO;
import com.aunnie.web.dto.ProductDTO;

@Service("productService")
public class ProductServiceImple implements ProductService{

	@Resource(name="productDAO")
	private ProductDAO dao;
	
	@Override
	public List<ProductDTO> getAll() {
		System.out.println("dao::: "+dao);
		return dao.selectAll();
	}

	@Override
	public ProductDTO readOne(int pno) {
		return dao.selectOne(pno);
	}

	@Override
	public void writeOne(ProductDTO dto) {
		dao.insertOne(dto);
	}

	@Override
	public void modifyOne(ProductDTO dto) {
		dao.updateOne(dto);
	}

	@Override
	public void removeOne(int pno) {
		dao.deleteOne(pno);
	}

}
