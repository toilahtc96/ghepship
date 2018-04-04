package vn.com.htc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vn.com.htc.model.History;
import vn.com.htc.service.HistoryService;
 
@Controller
@Scope(scopeName="session")
public class HelloWorldController {
	@Autowired
	@Qualifier(value="HistoryService")
	private HistoryService HistoryService;
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView mv = new ModelAndView("helloworld");
		List<History> listHistory = HistoryService.getAll();
		mv.addObject("listHistory",listHistory);
		mv.addObject("name", name);
		return mv;
	}
}