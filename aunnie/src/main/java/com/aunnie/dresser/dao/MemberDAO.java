package com.aunnie.dresser.dao;

import java.util.List;

import com.aunnie.dresser.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> selectAll();
}
