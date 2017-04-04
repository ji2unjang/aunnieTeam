package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.ReviewDTO;

public interface ReviewService {
	public List<ReviewDTO> getAll();
	public ReviewDTO readOne(int review_no);
	public void writeOne(ReviewDTO rdto);
	public void modifyOne(ReviewDTO rdto);
	public void deleteOne(int review_no);
}
