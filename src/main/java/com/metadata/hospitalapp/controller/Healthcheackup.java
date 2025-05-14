package com.metadata.hospitalapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheackup {
	@GetMapping("/health-cheakup")
	public String heathcheakup() {
		return"ok";
	}

}
