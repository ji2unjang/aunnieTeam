package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.EventDTO;

public interface EventService {
	public List<EventDTO> getAll();
	public EventDTO getOne(int no);
	public void writeOne(EventDTO dto);
	public void modifyOne(EventDTO dto);
	public void deleteOne(int no);
}
