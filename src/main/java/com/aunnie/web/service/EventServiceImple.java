package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.EventDAO;
import com.aunnie.web.dto.EventDTO;

@Service("eventService")
public class EventServiceImple implements EventService{

	@Resource(name="eventDAO")
	private EventDAO edao;
	
	@Override
	public List<EventDTO> getAll() {
		return edao.selectAll();
	}

	@Override
	public EventDTO getOne(int no) {
		return edao.selectOne(no);
	}

	@Override
	public void writeOne(EventDTO dto) {
		edao.insertOne(dto);
	}

	@Override
	public void modifyOne(EventDTO dto) {
		edao.updateOne(dto);
		
	}

	@Override
	public void deleteOne(int no) {
		edao.deleteOne(no);
		
	}
	
}
