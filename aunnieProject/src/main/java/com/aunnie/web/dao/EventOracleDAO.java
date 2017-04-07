package com.aunnie.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aunnie.web.dto.EventDTO;

@Repository("eventDAO")
public class EventOracleDAO implements EventDAO{
	
	@Autowired
	private SqlSession session;
	@Override
	public List<EventDTO> selectAll() {

		return session.selectList("com.aunnie.event.selectAll");
	}
	@Override
	public EventDTO selectOne(int no) {
		return session.selectOne("com.aunnie.event.selectOne", no);
	}
	@Override
	public void insertOne(EventDTO dto) {
		session.insert("com.aunnie.event.insertOne",dto);
	}
	@Override
	public void updateOne(EventDTO dto) {
		session.update("com.aunnie.event.updateOne", dto);
		
	}
	@Override
	public void deleteOne(int no) {
		session.delete("com.aunnie.event.deleteOne", no);
		
	}

}
