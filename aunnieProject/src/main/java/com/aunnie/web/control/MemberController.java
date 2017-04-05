package com.aunnie.web.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.MemberDTO;
import com.aunnie.web.service.MemberService;

@Controller
public class MemberController {

	@Resource(name = "memberService")
	private MemberService memberService;

	@RequestMapping("/memberList")
	public ModelAndView list() {
		return new ModelAndView("list", "list", memberService.getAll());
	}

	@RequestMapping("/sign")
	public String sing() {

		return "sign";
	}

	@RequestMapping("/signOk")
	public String signOk(@ModelAttribute("dto") MemberDTO dto, HttpServletRequest req) {

		memberService.writeOne(dto);

		return "redirect:memberList";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/loginOk")
	public String loginOk(MemberDTO memberdto, Model model){
		
		MemberDTO resultMemberdto = memberService.findUser(memberdto);
		
		if(resultMemberdto != null && !"".equals(resultMemberdto)){
			model.addAttribute("list", resultMemberdto);
			
			return "loginOk";
		}else{
			return "login";
		}
		
	}
	

}
