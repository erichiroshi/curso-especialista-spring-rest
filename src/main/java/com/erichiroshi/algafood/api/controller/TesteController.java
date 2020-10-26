package com.erichiroshi.algafood.api.controller;

import java.util.List;
import java.util.Optional;

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
	
	@GetMapping(value = "/cozinhas/por-nome")
	public List<Cozinha> cozinhasPorNome(@RequestParam(value = "nome") String nome){
		return cozinhaRepository.findTodasByNome(nome);
	}
	
	@GetMapping(value = "/cozinhas/unica-por-nome")
	public Optional<Cozinha> findByNome(@RequestParam(value = "nome") String nome){
		return cozinhaRepository.findByNome(nome);
	}
}
