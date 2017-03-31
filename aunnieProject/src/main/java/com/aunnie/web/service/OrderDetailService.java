package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.OrderDetailDTO;

public interface OrderDetailService {
	
	public List<OrderDetailDTO> selectAllS();
	public OrderDetailDTO selectOneS(int order_no);
	public void insertS(OrderDetailDTO dto);
	public void updateS(OrderDetailDTO dto);
	public void deleteS(int order_no);
	
}
