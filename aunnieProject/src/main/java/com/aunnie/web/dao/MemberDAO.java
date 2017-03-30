package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.MemberDTO;


public interface MemberDAO {
	public List<MemberDTO> selectAll();
	public MemberDTO selectOne(int no);
	public void insertOne(MemberDTO dto);
	public void updateOne(MemberDTO dto);
	public void deleteOne(int no);
}