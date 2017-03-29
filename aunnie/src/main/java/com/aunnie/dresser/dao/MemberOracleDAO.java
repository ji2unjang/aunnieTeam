package com.aunnie.dresser.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.dresser.dto.MemberDTO;

@Repository("memberDAO")
public class MemberOracleDAO implements MemberDAO{
	
	@Autowired
	private SqlSession session;

	@Override
	public List<MemberDTO> selectAll() {
		System.out.println("session : "+ session);
		return null;
	}
	
}
