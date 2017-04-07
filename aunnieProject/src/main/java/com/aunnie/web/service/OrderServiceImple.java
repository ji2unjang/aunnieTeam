package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.OrderDAO;
import com.aunnie.web.dto.OrderDTO;

@Service("orderService")
public class OrderServiceImple implements OrderService{
	
	@Resource(name="orderDAO")
	private OrderDAO dao;
	@Override
	public List<OrderDTO> selectAll() {
		return dao.selectAll();
	}

	@Override
	public OrderDTO selectOne(int order_no) {
		return dao.selectOne(order_no);
	}

	@Override
	public void insert(OrderDTO dto) {
		dao.insert(dto);
		
	}

	@Override
	public void update(OrderDTO dto) {
		dao.update(dto);
		
	}

	@Override
	public void delete(int order_no) {
		dao.delete(order_no);
		
	}

}
