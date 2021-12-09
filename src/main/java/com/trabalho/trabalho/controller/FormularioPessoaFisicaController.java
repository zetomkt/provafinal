package com.trabalho.trabalho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import model.PessoaFisica;

@Controller
public class FormularioPessoaFisicaController {
	
	@Autowired
	private PessoaRepositorio PessoaRepositorio;
	
	@GetMapping("FormularioPessoaFisica")
	public String home(Model model) {
		return "FormularioPessoaFisica";
	}
	
	@PostMapping("CadastrarPessoaFisica")
	public String FormularioPessoaFisica(PessoaFisica pessoa) {
		PessoaRepositorio.CadastrarPessoaFisica(pessoa);
		return "redirect:home";
	}
}
