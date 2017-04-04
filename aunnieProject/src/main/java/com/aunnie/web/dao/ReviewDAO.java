package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.ReviewDTO;

public interface ReviewDAO {
	public List<ReviewDTO> selectAll();
	public ReviewDTO selectOne(int review_no);
	public void insertOne(ReviewDTO rdto);
	public void updateOne(ReviewDTO rdto);
	public void deleteOne(int review_no);
}
