package com.erichiroshi.algafood.api.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erichiroshi.algafood.domain.model.Cozinha;
import com.erichiroshi.algafood.domain.model.Restaurante;
import com.erichiroshi.algafood.domain.repository.CozinhaRepository;
import com.erichiroshi.algafood.domain.repository.RestauranteRepository;

@RestController
@RequestMapping("/teste")
public class TesteController {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	@Autowired
	private RestauranteRepository restauranteRepository;

	@GetMapping("/cozinhas/por-nome")
	public List<Cozinha> listarPorNome(@RequestParam String nome) {
		List<Cozinha> list = cozinhaRepository.findByNomeContaining(nome);
		return list;
	}

	@GetMapping("/cozinhas/unica-por-nome")
	public Optional<Cozinha> cozinhaPorNome(String nome) {
		return cozinhaRepository.findByNome(nome);
	}
	
	@GetMapping("/cozinhas/existe-por-nome")
	public boolean cozinhaExistePorNome(String nome) {
		return cozinhaRepository.existsByNome(nome);
	}
	
	@GetMapping("/cozinhas/count-por-nome")
	public int cozinhaCountPorNome(String nome) {
		return cozinhaRepository.countByNome(nome);
	}

	@GetMapping("/restaurantes/por-taxa-frete")
	public List<Restaurante> restaurantePorTaxaFrete(BigDecimal taxaInicial, BigDecimal taxaFinal) {
		return restauranteRepository.findByTaxaFreteBetween(taxaInicial, taxaFinal);
	}

	@GetMapping("/restaurantes/por-nome")
	public List<Restaurante> restaurantesPorNomeECozinhaId(String nome, Long cozinhaId) {
		return restauranteRepository.findByNomeContainingAndCozinhaId(nome, cozinhaId);
	}

	@GetMapping("/restaurantes/primeiro-por-nome")
	public Optional<Restaurante> restaurantePrimeiroPorNome(String nome) {
		return restauranteRepository.findFirstRestauranteByNomeContaining(nome);
	}
	
	@GetMapping("/restaurantes/por-nome-top2")
	public List<Restaurante> restaurantesPorNomeTop2(String nome) {
		return restauranteRepository.findTop2ByNomeContaining(nome);
	}
	
	@GetMapping("/restaurantes/count-por-cozinhaId")
	public int restauranteCountCozinhaId(Long cozinhaId) {
		return restauranteRepository.countByCozinhaId(cozinhaId);
	}
}
