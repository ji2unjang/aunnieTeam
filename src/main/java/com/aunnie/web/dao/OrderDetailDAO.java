package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.OrderDetailDTO;

public interface OrderDetailDAO {

	public List<OrderDetailDTO> selectAll();
	public OrderDetailDTO selectOne(int order_no);
	public void insertOne(OrderDetailDTO dto);
	public void update(OrderDetailDTO dto);
	public void delete(int order_no);
	
}
