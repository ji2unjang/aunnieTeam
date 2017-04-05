package com.aunnie.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.web.dto.ProductDTO;
@Repository("productDAO")
public class ProductOracleDAO implements ProductDAO{
	
	@Autowired
	private SqlSession session;
	@Override
	public List<ProductDTO> selectAll() {
		return session.selectList("com.aunnie.product.selectAll");
	}

	@Override
	public ProductDTO selectOne(int pno) {
		return session.selectOne("com.aunnie.product.selectOne",pno);
	}

	@Override
	public void insertOne(ProductDTO dto) {
		session.insert("com.aunnie.product.insertOne",dto);
	}

	@Override
	public void updateOne(ProductDTO dto) {
		session.update("com.aunnie.product.updateOne",dto);
	}

	@Override
	public void deleteOne(int pno) {
		session.delete("com.aunnie.product.deleteOne",pno);
	}

}
