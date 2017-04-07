package com.aunnie.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.web.dto.MemberDTO;
import com.aunnie.web.dto.MirrorTalkDTO;

@Repository("mirrortalkDAO")
public class MirrorTalkOracleDAO implements MirrorTalkDAO{

	@Autowired
	private SqlSession session;
	@Override
	public List<MirrorTalkDTO> selectAll() {
		return session.selectList("com.aunnie.mirrorTalk.selectAll");
	}

	@Override
	public MirrorTalkDTO selectOne(int no) {
		return session.selectOne("com.aunnie.mirrorTalk.selectOne", no);
	}

	@Override
	public void insertOne(MirrorTalkDTO dto) {
		session.insert("com.aunnie.mirrorTalk.insertOne", dto);
		
	}

	@Override
	public void updateOne(MirrorTalkDTO dto) {
		session.update("com.aunnie.mirrorTalk.updateOne", dto);
		
	}

	@Override
	public void deleteOne(int no) {
		session.delete("com.aunnie.mirrorTalk.deleteOne", no);
		
	}
	
}
