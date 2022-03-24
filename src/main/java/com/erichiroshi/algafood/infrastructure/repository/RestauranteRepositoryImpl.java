package com.erichiroshi.algafood.infrastructure.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.erichiroshi.algafood.domain.model.Restaurante;
import com.erichiroshi.algafood.domain.repository.RestauranteRepositoryQuery;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal) {

		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Restaurante> criteria = builder.createQuery(Restaurante.class);
		criteria.from(Restaurante.class);

		TypedQuery<Restaurante> query = manager.createQuery(criteria);
		return query.getResultList();
	}
}
