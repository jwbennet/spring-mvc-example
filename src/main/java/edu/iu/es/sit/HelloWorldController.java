package edu.iu.es.sit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("")
	public ModelAndView sayHello() {
		ModelAndView modelAndView = new ModelAndView();
		String message = "Hello world!";
		modelAndView.addObject("message", message);
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}
