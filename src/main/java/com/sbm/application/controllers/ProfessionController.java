package com.sbm.application.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbm.application.entities.concretes.Profession;
import com.sbm.application.repositories.concretes.ProfessionRepository;

import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/professions")
public class ProfessionController {
	private final ProfessionRepository professionRepository;

	public ProfessionController(ProfessionRepository professionRepository) {
		this.professionRepository = professionRepository;
	}
	@GetMapping("/getall")
	public String GetAll(Model model) {
		ArrayList<String> professions = new ArrayList<String>();
		professionRepository.findAll().map(p->p.toString()).doOnNext(professions::add).blockLast();
		model.addAttribute("content", professions);
		return "showContent";
	}
	
	@PostMapping("/create")
	@ResponseBody
	public Mono<Profession> Create(@RequestBody Profession profession) {
		return professionRepository.save(profession);
	}
}
