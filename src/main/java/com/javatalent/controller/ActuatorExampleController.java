package com.javatalent.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorExampleController {
	@GetMapping("/hello")
	public String printMessage() {
		return "Hi Welcome to JavaTalent!! " + new Date();
	}

}
