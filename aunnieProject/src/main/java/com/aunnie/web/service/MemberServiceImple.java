package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.MemberDAO;
import com.aunnie.web.dto.MemberDTO;
@Service("memberService")
public class MemberServiceImple implements MemberService{

	@Resource(name="memberDAO")
	private MemberDAO dao;
	
	@Override
	public List<MemberDTO> getAll() {
		return dao.selectAll();
	}

}
