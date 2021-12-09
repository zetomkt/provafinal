package com.trabalho.trabalho.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import model.Pessoa;
import model.PessoaFisica;


@Controller
public class HomeController {
	
	@Autowired
	private PessoaRepositorio PessoaRepositorio;
	
	
	@GetMapping("home")
	public String home(Model model) {
		model.addAttribute("pessoasFisicas", PessoaRepositorio.getPessoasFisicas());
		model.addAttribute("pessoasJuridicas", PessoaRepositorio.getPessoasJuridicas());
		return "home";
	}
}
