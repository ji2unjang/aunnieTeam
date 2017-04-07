package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.CouponDAO;
import com.aunnie.web.dto.CouponDTO;

@Service("couponService")
public class CouponServiceImple implements CouponService{

	@Resource(name="couponDAO")
	private CouponDAO cdao;
	
	@Override
	public List<CouponDTO> getAll() {
		return cdao.selectAll();
	}

	@Override
	public CouponDTO getOne(int no) {
		return cdao.selectOne(no);
	}

	@Override
	public void writeOne(CouponDTO dto) {
		cdao.insertOne(dto);
	}

	@Override
	public void modifyOne(CouponDTO dto) {
		cdao.updateOne(dto);
	}

	@Override
	public void deleteOne(int no) {
		cdao.deleteOne(no);
	}

}
