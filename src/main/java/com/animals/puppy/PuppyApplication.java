package com.animals.puppy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class PuppyApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}


	public static void main(String[] args) {
		SpringApplication.run(PuppyApplication.class, args);
	}

}
