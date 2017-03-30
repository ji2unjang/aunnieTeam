package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.QuestionsDTO;

public interface QuestionsDAO {
	public List<QuestionsDTO> selectAll();
	public QuestionsDTO selectOne(int q_no);
	public void insertOne(QuestionsDTO qdto);
	public void updateOne(QuestionsDTO qdto);
	public void deleteOne(int q_no);
}
