package com.erichiroshi.algafood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.domain.model.Cozinha;

@Component
public class CadastroCozinha {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Cozinha> listar() {
		return entityManager.createQuery("FROM Cozinha", Cozinha.class)
				.getResultList();
	}
}
