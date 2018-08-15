package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/showMessage.html")
	public ModelAndView index(ModelAndView mv) {
		mv.setViewName("showMessage");
		mv.addObject("message", "Hello");
		return mv;
	}
}
