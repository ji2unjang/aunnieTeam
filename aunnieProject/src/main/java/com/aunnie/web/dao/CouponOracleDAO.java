package com.aunnie.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.web.dto.CouponDTO;

@Repository("couponDAO")
public class CouponOracleDAO implements CouponDAO{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<CouponDTO> selectAll() {
		return session.selectList("com.aunnie.coupon.selectAll");
	}

	@Override
	public CouponDTO selectOne(int no) {
		return session.selectOne("com.aunnie.coupon.selectOne", no);
	}

	@Override
	public void insertOne(CouponDTO dto) {
		session.insert("com.aunnie.coupon.insertOne", dto);
	}

	@Override
	public void updateOne(CouponDTO dto) {
		session.update("com.aunnie.coupon.updateOne", dto);
	}

	@Override
	public void deleteOne(int no) {
		session.delete("com.aunnie.coupon.deleteOne", no);
	}
	
}
