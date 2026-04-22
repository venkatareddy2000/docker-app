package com.augusta.kranken.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class DockerController {

	@GetMapping("/name")
	public String getName() {
		return "Challa Venkata Reddy";
	}
}
