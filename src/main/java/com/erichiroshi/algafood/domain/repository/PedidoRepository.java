package com.erichiroshi.algafood.domain.repository;

import org.springframework.stereotype.Repository;

import com.erichiroshi.algafood.domain.model.Pedido;

@Repository
public interface PedidoRepository extends CustomJpaRepository<Pedido, Long> {

}