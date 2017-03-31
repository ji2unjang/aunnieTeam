package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.CouponDTO;

public interface CouponDAO {
	public List<CouponDTO> selectAll();
	public CouponDTO selectOne(int no);
	public void insertOne(CouponDTO dto);
	public void updateOne(CouponDTO dto);
	public void deleteOne(int no);
}
