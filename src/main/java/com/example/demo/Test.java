package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Test {

	@RequestMapping("/test")
	public String test() {
		return "aaaaaa";
	}
}