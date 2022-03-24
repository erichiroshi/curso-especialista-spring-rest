package com.erichiroshi.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erichiroshi.algafood.domain.model.Cozinha;
import com.erichiroshi.algafood.domain.repository.CozinhaRepository;

@RestController
@RequestMapping("/teste")
public class TesteController {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	@GetMapping("/cozinhas/por-nome")
	public List<Cozinha> listarPorNome(@RequestParam String nome){
		List<Cozinha> list = cozinhaRepository.consultaPorNome(nome);
		return list;
	}
	
}
