package com.erichiroshi.algafood.domain.repository;

import org.springframework.stereotype.Repository;

import com.erichiroshi.algafood.domain.model.Usuario;

@Repository
public interface UsuarioRepository extends CustomJpaRepository<Usuario, Long> {

}