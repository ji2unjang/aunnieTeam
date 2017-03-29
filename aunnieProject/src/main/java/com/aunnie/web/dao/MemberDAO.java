package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.MemberDTO;


public interface MemberDAO {
	public List<MemberDTO> selectAll();
}
