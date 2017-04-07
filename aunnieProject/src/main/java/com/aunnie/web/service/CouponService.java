package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.CouponDTO;

public interface CouponService {
	public List<CouponDTO> getAll();
	public CouponDTO getOne(int no);
	public void writeOne(CouponDTO dto);
	public void modifyOne(CouponDTO dto);
	public void deleteOne(int no);
}
