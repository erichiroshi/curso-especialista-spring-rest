package com.erichiroshi.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.erichiroshi.algafood.domain.model.Cozinha;
import com.erichiroshi.algafood.domain.repository.CozinhaRepository;

public class CozinhaRepositoryImpl implements CozinhaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Cozinha> listar() {
		return entityManager.createQuery("FROM Cozinha", Cozinha.class).getResultList();
	}

	@Override
	public Cozinha buscar(Long id) {
		return entityManager.find(Cozinha.class, id);
	}

	@Transactional
	@Override
	public Cozinha salvar(Cozinha cozinha) {
		return entityManager.merge(cozinha);
	}

	@Transactional
	@Override
	public void remover(Cozinha cozinha) {
		cozinha = buscar(cozinha.getId());
		entityManager.remove(cozinha);
	}

}