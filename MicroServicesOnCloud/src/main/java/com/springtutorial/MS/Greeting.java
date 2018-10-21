package com.springtutorial.MS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Greeting {
	
	@RequestMapping("/greeting")
	public String greeting() {
		System.out.println("Saying Hello...");
		return "welcome.html";
	}
}
