package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.MemberDAO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO dao;
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	@RequestMapping("/listMember")//
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.findAll());//
		mav.setViewName("list");//
		return mav;
	}
}
