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
	
	
	@RequestMapping("/eventList2")
	public ModelAndView list(){
		return new ModelAndView("eventList", "list", es.getAll());
	}
	
	@RequestMapping("/detail2")
	public ModelAndView detail(
			@RequestParam("e_code")int e_code){
		return new ModelAndView("eventDetail", "dto", es.getOne(e_code));
	}
	
	@RequestMapping("/writeForm2")
	public String writeFrom(){
		return "writeForm2";
	}
	@RequestMapping("/writeOk2")
	public String write(
			@ModelAttribute("dto")EventDTO dto,
			HttpServletRequest req){
		es.writeOne(dto);
		return "redirect:/eventList";
	}
	
	@RequestMapping("/modifyForm2")
	public ModelAndView modifyForm(
			@RequestParam("e_code")int e_code){
		return new ModelAndView("modifyForm", "dto", es.getOne(e_code));
	}
	
	@RequestMapping("/modifyOk2")
	public String modifyOk(
			@ModelAttribute("dto")EventDTO dto){
		es.modifyOne(dto);
		return "redirect:/eventList";
	}
	@RequestMapping("/delete2")
	public String delete(
			@RequestParam("e_code")int e_code){
		es.deleteOne(e_code);
		return "redirect:/eventList";
	}
	
	
	
	
			
}
