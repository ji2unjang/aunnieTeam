package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.QuestionsDTO;

public interface QuestionsService {
	public List<QuestionsDTO> getAll();
	public QuestionsDTO readOne(int q_no);
	public void writeOne(QuestionsDTO qdto);
	public void modifyOne(QuestionsDTO qdto);
	public void deleteOne(int q_no);
	
}
