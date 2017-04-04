package com.aunnie.web.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	private MemberService service;

	@RequestMapping("/memberList")
	public ModelAndView list() {
		return new ModelAndView("list", "list", service.getAll());
	}

	@RequestMapping("/sign")
	public String sing() {

		return "sign";
	}

	@RequestMapping("/signOk")
	public String signOk(@ModelAttribute("dto") MemberDTO dto, HttpServletRequest req) {

		service.writeOne(dto);

		return "redirect:memberList";
	}


	

}
