package com.example.demo.trySpring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@COntroller
@Controller
public class HellorController {
	
	//@GetMapping
	@GetMapping("/hello")
	public String getHello() {
		
		//helloe.htmlに遷移
		return "hello";
		
	}
	

}
