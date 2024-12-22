package com.spring_boot_backend.demo.MainController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@RequestMapping("/Home")
	public String ControllerMain() {
		return "hello im controller";
	}
}
