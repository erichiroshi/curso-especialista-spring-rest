package com.erichiroshi.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.erichiroshi.algafood.domain.model.Restaurante;
import com.erichiroshi.algafood.domain.repository.RestauranteRepository;

public class RestauranteRepositoryImpl implements RestauranteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Restaurante> listar() {
		return entityManager.createQuery("FROM Restaurante", Restaurante.class).getResultList();
	}

	@Override
	public Restaurante buscar(Long id) {
		return entityManager.find(Restaurante.class, id);
	}

	@Transactional
	@Override
	public Restaurante salvar(Restaurante restaurante) {
		return entityManager.merge(restaurante);
	}

	@Transactional
	@Override
	public void remover(Restaurante restaurante) {
		restaurante = buscar(restaurante.getId());
		entityManager.remove(restaurante);
	}

}
