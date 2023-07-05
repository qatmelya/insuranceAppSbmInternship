package com.sbm.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/insurances")
public class InsuranceController {

	private final String controllerName = "insurances";

	@GetMapping("/calculate/{name}")
	public String calculate(@PathVariable String name, Model model) {
		model.addAttribute("controller", controllerName);
		model.addAttribute("page", name + "Calculate");
		return "app";
	}
	
	@PostMapping("/calculate/{name}")
	@ResponseBody
	public String calculate(@PathVariable String name) {
		return name;
	}

	@GetMapping("/details/{name}")
	public String details(@PathVariable String name, Model model) {
		model.addAttribute("controller", controllerName);
		model.addAttribute("page", name + "Details");
		return "app";
	}
}
