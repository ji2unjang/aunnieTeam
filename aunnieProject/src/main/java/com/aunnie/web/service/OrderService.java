package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.OrderDTO;

public interface OrderService {
	public List<OrderDTO> selectAll();
	public OrderDTO selectOne(int order_no);
	public void insert(OrderDTO dto);
	public void update(OrderDTO dto);
	public void delete(int order_no);

}
