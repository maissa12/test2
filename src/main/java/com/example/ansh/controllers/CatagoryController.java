package com.example.ansh.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("catagory")
public class CatagoryController {

	@GetMapping()
	public String getExternalMessage() {
		
		return "This is Catagory Information";
	}
}
