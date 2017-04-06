/*package com.aunnie.web.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.QuestionsDTO;
import com.aunnie.web.service.QuestionsService;

@Controller
public class QuestionsController {
	private static final Logger log = LoggerFactory.getLogger(QuestionsController.class);

	@Resource(name="QuestionsService")
	private QuestionsService service;
	
	@RequestMapping("/questionList")
	public ModelAndView list(){
		
	return new ModelAndView("list","list",service.getAll());
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(
			 @RequestParam("q_no") int q_no ){

		return new ModelAndView("detail", "qdto", service.readOne(1));

	}
	@RequestMapping("/writeForm")
	public String form() {
		return "writeForm";
	}
	@RequestMapping("/writeOk")
	public String write(@ModelAttribute("dto") QuestionsDTO qdto) {
		
		service.writeOne(qdto);	

		return "redirect:/questionList";
	}
	@RequestMapping("/deleteOk")
	public String delete(@RequestParam("q_no") int q_no) {
		service.deleteOne(q_no);

		return "redirect:/questionList";

	}


}
*/