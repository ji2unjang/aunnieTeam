package com.aunnie.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.web.dto.ProductOptionDTO;

@Repository("productOptionDAO")
public class ProductOptionOracleDAO implements ProductOptionDAO{

	@Autowired
	private SqlSession session;
	
	@Override
	public List<ProductOptionDTO> selectAll() {
		return session.selectList("com.aunnie.productOption.selectAll");
	}

	@Override
	public ProductOptionDTO selectOne(int ono) {
		return session.selectOne("com.aunnie.productOption.selectOne",ono);
	}

	@Override
	public void insertOne(ProductOptionDTO dto) {
		session.insert("com.aunnie.productOption.insertOne", dto);
	}

	@Override
	public void updateOne(ProductOptionDTO dto) {
		session.update("com.aunnie.productOption.updateOne",dto);
	}

	@Override
	public void deleteOne(int ono) {
		session.delete("com.aunnie.productOption.deleteOne", ono);
	}

}
