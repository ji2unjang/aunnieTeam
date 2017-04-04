package com.aunnie.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.web.dto.OrderDTO;
@Repository("orderDAO")
public class OrderOracleDAO implements OrderDAO{

	@Autowired
	private SqlSession session;
	
	@Override
	public List<OrderDTO> selectAll() {
		 return session.selectList("com.aunnie.order.selectAll");
	}

	@Override
	public OrderDTO selectOne(int order_no) {

		return session.selectOne("com.aunnie.order.selectOne",order_no);
	}

	@Override
	public void insert(OrderDTO dto) {
		session.insert("com.aunnie.order.insert",dto);
		
	}

	@Override
	public void update(OrderDTO dto) {
		session.update("com.aunnie.order.update",dto);
		
	}

	@Override
	public void delete(int order_no) {
		session.delete("com.aunnie.order.delete",order_no);
		
	}
	
	
}
