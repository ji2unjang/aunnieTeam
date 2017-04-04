package com.aunnie.web.control;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.ReviewDTO;
import com.aunnie.web.service.ReviewService;

@Controller
public class ReviewController {
	private static final Logger log = LoggerFactory.getLogger(ReviewController.class);

	@Resource(name="reviewService")
	private ReviewService service;

	@RequestMapping("/reviewList")
	public ModelAndView list(){
		log.info("test","test.............");
		return new ModelAndView("rList","rList",service.getAll());
		
	}
	@RequestMapping("/reviewDetail")
	public ModelAndView detail(
		@RequestParam("review_no") int review_no){

		return new ModelAndView("rdetail", "rdto", service.readOne(review_no));

	}
	@RequestMapping("/reviewWriteForm")
	public String form() {
	
		return "rwriteForm";
	}
	@RequestMapping("/rWriteOk")
	public String write(
			@ModelAttribute("rdto")ReviewDTO rdto) {
		System.out.println("ok1");
		service.writeOne(rdto);
		System.out.println("ok2");

		return "redirect:/reviewList";
	}
	@RequestMapping("/rDeleteOk")
	public String delete(@RequestParam("review_no")int review_no){
		service.deleteOne(review_no);
		
		return "redirect:/reviewList";
			
	}
	@RequestMapping("/rModifyForm")
	public ModelAndView modifyForm(@RequestParam("review_no") int review_no) {
		return new ModelAndView("rModifyForm", "modi", service.readOne(review_no));
	}

	@RequestMapping("/rModifyOk")
	public String modifyOk(
			@ModelAttribute("dto") ReviewDTO rdto) {
		
		service.modifyOne(rdto);
		
		return "redirect:/reviewList";

	}

}
