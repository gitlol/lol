package springbootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class hellocontroller {
	

	@RequestMapping("/hello") 
	 public String hello() {
			
		return "hello world"; 
	}
}
