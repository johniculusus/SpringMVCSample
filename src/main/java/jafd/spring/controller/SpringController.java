package jafd.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SpringController {
	
	@RequestMapping(value="/Hello", method = RequestMethod.GET)
	public String successNo(ModelMap model) { 
		model.addAttribute("msg", "Maven Java Web Application Project: Succeed!");

		return "SpringHello";
 
	}
 
	@RequestMapping(value="/HelloPrint/{arg}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String arg, ModelMap model) {
		model.addAttribute("msg", "Maven Java Web Application Project, variable test: " + arg);
		
		return "SpringHello";
	}
 
}
