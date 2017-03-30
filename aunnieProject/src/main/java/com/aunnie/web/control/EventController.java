package com.aunnie.web.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.EventDTO;
import com.aunnie.web.service.EventService;

@Controller
public class EventController {
	@Resource(name="eventService")
	private EventService es;
	
	
	@RequestMapping("/eventList")
	public ModelAndView list(){
		return new ModelAndView("eventList", "list", es.getAll());
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(
			@RequestParam("e_code")int e_code){
		return new ModelAndView("eventDetail", "dto", es.getOne(e_code));
	}
	
	@RequestMapping("/writeForm")
	public String writeFrom(){
		return "writeForm";
	}
	@RequestMapping("/writeOk")
	public String write(
			@ModelAttribute("dto")EventDTO dto,
			HttpServletRequest req){
		es.writeOne(dto);
		return "redirect:/eventList";
	}
	
	@RequestMapping("/modifyForm")
	public ModelAndView modifyForm(
			@RequestParam("e_code")int e_code){
		return new ModelAndView("modifyForm", "dto", es.getOne(e_code));
	}
	
	@RequestMapping("/modifyOk")
	public String modifyOk(
			@ModelAttribute("dto")EventDTO dto){
		es.modifyOne(dto);
		return "redirect:/eventList";
	}
	@RequestMapping("/delete")
	public String delete(
			@RequestParam("e_code")int e_code){
		es.deleteOne(e_code);
		return "redirect:/eventList";
	}
	
	
	
	
			
}
