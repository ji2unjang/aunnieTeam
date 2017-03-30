package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.QuestionsDTO;

public interface QuestionsService {
	public List<QuestionsDTO> getAll();
	public QuestionsDTO getOne(int no);
	public void writeOne(QuestionsDTO dto);
	public void modifyOne(QuestionsDTO dto);
	public void deleteOne(int no);
	
}
