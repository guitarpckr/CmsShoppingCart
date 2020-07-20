package com.tts.ShoppingCart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/someRandomePage")
	public String home() {
		return "home";
	}
	
}
