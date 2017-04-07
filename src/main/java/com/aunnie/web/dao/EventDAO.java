package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.EventDTO;

public interface EventDAO {
	public List<EventDTO> selectAll();
	public EventDTO selectOne(int no);
	public void insertOne(EventDTO dto);
	public void updateOne(EventDTO dto);
	public void deleteOne(int no);
}
