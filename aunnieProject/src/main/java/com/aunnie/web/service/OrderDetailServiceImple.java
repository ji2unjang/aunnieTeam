package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.OrderDetailDAO;
import com.aunnie.web.dto.OrderDetailDTO;

@Service("OrderDetailService")
public class OrderDetailServiceImple implements OrderDetailService{

	@Resource(name="OrderDetailDAO")
	private OrderDetailDAO dao;
	
	@Override
	public List<OrderDetailDTO> selectAllS() {
		return dao.selectAll();
	}

	@Override
	public OrderDetailDTO selectOneS(int order_no) {
		return dao.selectOne(order_no);
	}

	@Override
	public void insertS(OrderDetailDTO dto) {
		dao.insertOne(dto);
	}

	@Override
	public void updateS(OrderDetailDTO dto) {
		dao.update(dto);
	}

	@Override
	public void deleteS(int order_no) {
		dao.delete(order_no);
	}

}
