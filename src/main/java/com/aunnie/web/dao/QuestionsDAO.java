package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.QuestionsDTO;

public interface QuestionsDAO {
	public List<QuestionsDTO> selectAll();
	public QuestionsDTO selectOne(int no);
	public void insertOne(QuestionsDTO dto);
	public void updateOne(QuestionsDTO dto);
	public void deleteOne(int no);
}
