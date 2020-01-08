package com.del.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login.htm")
	public ModelAndView login(@RequestParam("uname") String uname, @RequestParam("password") String password) throws Exception{
		String msg;
		ModelAndView mv = new ModelAndView();
		if(uname.equals("admin")&& password.equals("qwerty")){
			msg = "Welcome " + uname;
			mv.setViewName("dashboard");
		}
		else{
			msg = "Incorrect Username or Password";
			mv.setViewName("error");
		}
		mv.addObject("message",msg);
		return mv;
	}
	

}