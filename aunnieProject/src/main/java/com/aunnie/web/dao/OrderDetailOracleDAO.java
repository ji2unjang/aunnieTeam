package com.aunnie.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.web.dto.OrderDetailDTO;

@Repository("OrderDetailDAO")
public class OrderDetailOracleDAO implements OrderDetailDAO{
	@Autowired
	private SqlSession session;
	
	@Override
	public List<OrderDetailDTO> selectAll() {
		return session.selectList("com.aunnie.orderDetail.selectAll");
	}

	@Override
	public OrderDetailDTO selectOne(int order_no) {
		return session.selectOne("com.aunnie.orderDetail.selectOne",order_no);
	}

	@Override
	public void insertOne(OrderDetailDTO dto) {
		session.insert("com.aunnie.orderDetail.insetOne",dto);
		
	}

	@Override
	public void update(OrderDetailDTO dto) {
		session.update("com.aunnie.orderDetail.update",dto);
		
	}

	@Override
	public void delete(int order_no) {
		session.delete("com.aunnie.orderDetail.delete",order_no);
		
	}

}
