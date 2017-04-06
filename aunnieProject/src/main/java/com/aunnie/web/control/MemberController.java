package com.aunnie.web.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.MemberDTO;
import com.aunnie.web.service.MemberService;

@Controller
public class MemberController {

	@Resource(name = "memberService")
	private MemberService service;

	@RequestMapping("/memberList")
	public ModelAndView list() {
		return new ModelAndView("list", "list", service.getAll());
	}

	@RequestMapping("/sign")
	public String sign() {
		return "sign";
	}

	@RequestMapping("/signOk")
	public String signOk(
			@ModelAttribute("dto") MemberDTO dto
			) {
		System.out.println("Birthday: "+dto.getBirthday());
		System.out.println("여기 왔다감");

		service.writeOne(dto);
	
	return "redirect:/memberList";
	}
	
	@RequestMapping("/idCheckOk")
	public ModelAndView idCheckOk(@RequestParam("id")String id){
		System.out.println(id);
		
	return new ModelAndView("sign", "id", service.checkId(id));
	}
		
}
