package com.aunnie.web.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.web.dto.MemberDTO;


@Repository("memberDAO")
public class MemberOracleDAO implements MemberDAO{
	
	@Autowired
	private SqlSession session;

	@Override
	public List<MemberDTO> selectAll() {
		return session.selectList("com.aunnie.member.selectAll");
	}

	@Override
	public MemberDTO selectOne(int no) {
		return session.selectOne("com.aunnie.member.selectOne");
	}

	@Override
	public void insertOne(MemberDTO dto) {
		session.insert("com.aunnie.member.insertOne",dto);
	}

	@Override
	public void updateOne(MemberDTO dto) {
		session.update("com.aunnie.member.updateOne",dto);
	}

	@Override
	public void deleteOne(int no) {
		session.update("com.aunnie.member.deleteOne",no);
	}
	
}
