package com.aunnie.web.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.MirrorTalkDTO;
import com.aunnie.web.service.MirrorTalkService;

@Controller
public class MirrorTalkController {
	@Resource(name="MirrorTalkService")
	private MirrorTalkService ms;
	
	@RequestMapping("/talkList")
		public ModelAndView list(){
		return new ModelAndView("talkList", "list", ms.getAll());
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(
			@RequestParam("talk_no")int talk_no){
		return new ModelAndView("talkDetail", "dto", ms.getOne(talk_no));
	}
	
	@RequestMapping("/writeForm")
	public String writeForm(){
		return "writeForm";
	}
	
	@RequestMapping("/writeOk")
	public String write(
			@ModelAttribute("dto")MirrorTalkDTO dto,
			HttpServletRequest req){
		System.out.println("dto"+dto.getT_like());
		ms.writeOne(dto);
		return "redirect:/talkList";
	}
	
	@RequestMapping("/modifyForm")
	public ModelAndView modifyFrom(
			@RequestParam("talk_no")int talk_no){
		return new ModelAndView("modifyForm", "dto", ms.getOne(talk_no));
		
	}
	
	@RequestMapping("/modifyOk")
	public String modifyOk(
			@ModelAttribute("dto")MirrorTalkDTO dto){
		ms.modifyOne(dto);
		return "redirect:/talkList";
	}
	
	@RequestMapping("/delete")
	public String delete(
			@RequestParam("talk_no")int talk_no){
		ms.deleteOne(talk_no);
		return "redirect:/talkList";
	}
	
}
