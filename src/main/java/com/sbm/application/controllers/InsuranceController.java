package com.sbm.application.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbm.application.entities.concretes.City;
import com.sbm.application.entities.concretes.Customer;
import com.sbm.application.entities.concretes.Profession;

@Controller
@RequestMapping("/insurances")
public class InsuranceController {

	private final String controllerName = "insurances";

	@GetMapping("/calculate/{name}")
	public String calculate(@PathVariable String name, Model model) {
		model.addAttribute("controller", controllerName);
		model.addAttribute("page", name + "Calculate");
		Customer customer = new Customer();
		ArrayList<Profession> professions = new ArrayList<Profession>();
		ArrayList<City> cities = new ArrayList<City>();
		model.addAttribute("customer", customer);
		model.addAttribute("professions", professions);
		model.addAttribute("cities", cities);
		
		return "app";
	}
	
	@PostMapping("/calculate/{name}")
	@ResponseBody
	public String calculate(@ModelAttribute("customer") Customer customer, @PathVariable String name) {
		return name;
	}

	@GetMapping("/details/{name}")
	public String details(@PathVariable String name, Model model) {
		model.addAttribute("controller", controllerName);
		model.addAttribute("page", name + "Details");
		return "app";
	}
}
