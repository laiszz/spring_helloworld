package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		return "<b>Hello World!</b>";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Responsabilidade Pessoal<br />"
				+ "Mentalidade de Crescimento<br />"
				+ "Orientação ao Futuro<br />"
				+ "Persistência<br />"
				+ "Comunicação<br />"
				+ "Orientação aos Detalhes<br />"
				+ "Trabalho em Equipe<br />"
				+ "Proatividade</b>";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<b>Objetivos<br />"
				+ "- Reaprender um pouco de html<br />"
				+ "- Apender o spring<br />"
				+ "- Colocar o mysql mais em prática";
	}
}