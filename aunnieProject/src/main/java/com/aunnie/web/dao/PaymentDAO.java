package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.PaymentDTO;

public interface PaymentDAO {
	public List<PaymentDTO> selectAll();
	public PaymentDTO selectOne(int payment_no);
	public void insertOne(PaymentDTO dto);
	public void update(PaymentDTO dto);
	public void deleteOne(int payment_no);
	
}
