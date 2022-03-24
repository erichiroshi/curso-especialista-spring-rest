package com.erichiroshi.algafood.domain.repository;

import java.util.List;

import com.erichiroshi.algafood.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> listar();
	List<Cozinha> consultaPorNome(String nome);
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Long id);
}
