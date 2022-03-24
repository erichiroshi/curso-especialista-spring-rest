package com.erichiroshi.algafood.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erichiroshi.algafood.domain.model.Cozinha;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {

	List<Cozinha> findByNomeContaining(String nome);

	Optional<Cozinha> findByNome(String nome);

	boolean existsByNome(String nome);
	
	int countByNome(String nome);
}
