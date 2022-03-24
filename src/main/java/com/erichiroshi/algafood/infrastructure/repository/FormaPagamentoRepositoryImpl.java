package com.erichiroshi.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.erichiroshi.algafood.domain.model.FormaPagamento;
import com.erichiroshi.algafood.domain.repository.FormaPagamentoRepository;

@Repository
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<FormaPagamento> listar() {
		return entityManager.createQuery("FROM FormaPagamento", FormaPagamento.class).getResultList();
	}

	@Override
	public FormaPagamento buscar(Long id) {
		return entityManager.find(FormaPagamento.class, id);
	}

	@Transactional
	@Override
	public FormaPagamento salvar(FormaPagamento formaPagamento) {
		return entityManager.merge(formaPagamento);
	}

	@Transactional
	@Override
	public void remover(FormaPagamento formaPagamento) {
		formaPagamento = buscar(formaPagamento.getId());
		entityManager.remove(formaPagamento);
	}

}
