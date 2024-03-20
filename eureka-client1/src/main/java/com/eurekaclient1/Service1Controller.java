package com.eurekaclient1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

	@GetMapping("/")
	public String greetings() {
		return "welcome to service 1";
	}
}
