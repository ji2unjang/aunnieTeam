package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.PaymentDAO;
import com.aunnie.web.dto.PaymentDTO;

@Service("paymentService")
public class PaymentServiceImple implements PaymentService{
	

	@Resource(name="paymentDAO")
	private PaymentDAO dao;
	
/*	@Override
	public List<PaymentDTO> selectAll() {
		return dao.selectAll();
	}

	@Override
	public void insertOne(PaymentDTO dto) {
		dao.insertOne(dto);
	}

	@Override
	public void deleteOne(int payment_no) {
		dao.deleteOne(payment_no);
	}*/
	
	
	@Override
	public List<PaymentDTO> selectAll() {
		return dao.selectAll();
	}

	@Override
	public PaymentDTO selectOne(int payment_no) {
		
		return dao.selectOne(payment_no);
	}

	@Override
	public void insertOne(PaymentDTO dto) {
		dao.insertOne(dto);
		
	}

	@Override
	public void update(PaymentDTO dto) {
		dao.update(dto);
	}

	@Override
	public void deleteOne(int payment_no) {
		dao.deleteOne(payment_no);
		
	}


}
