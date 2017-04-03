package com.aunnie.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.web.dto.PaymentDTO;

@Repository("paymentDAO")
public class PaymentOracleDAO implements PaymentDAO{


	@Autowired
	private SqlSession session;
	
	@Override
	public List<PaymentDTO> selectAll() {
		return session.selectList("com.aunnie.payment.selectAll");
	}

	@Override
	public PaymentDTO selectOne(int payment_no) {

		return session.selectOne("com.aunnie.payment.selectOne",payment_no);
	}

	@Override
	public void insertOne(PaymentDTO dto) {

		session.insert("com.aunnie.payment.insertOne",dto);
	}

	@Override
	public void update(PaymentDTO dto) {
		session.update("com.aunnie.payment.updateOne",dto);
		
	}

	@Override
	public void deleteOne(int payment_no) {
		session.delete("com.aunnie.payment.deleteOne",payment_no);
	}
	


}
