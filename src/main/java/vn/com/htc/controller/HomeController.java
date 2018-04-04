package vn.com.htc.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("session")
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView getHome() {
		ModelAndView modelAndView = new ModelAndView();
		String message = "test Request";
		modelAndView.addObject("message",message);
		return modelAndView;
	}
}
