package com.trabalho.trabalho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import model.PessoaJuridica;

@Controller
public class FormularioPessoaJuridicaController {
	
	@Autowired
	private PessoaRepositorio PessoaRepositorio;
	
	@GetMapping("FormularioPessoaJuridica")
	public String home(Model model) {
		return "FormularioPessoaJuridica";
	}
	
	@PostMapping("CadastrarPessoaJuridica")
	public String FormularioPessoaJuridica(PessoaJuridica pessoa) {
		PessoaRepositorio.CadastrarPessoaJuridica(pessoa);
		return "redirect:home";
	}

}
