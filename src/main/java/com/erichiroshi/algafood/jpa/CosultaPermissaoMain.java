package com.erichiroshi.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.erichiroshi.algafood.AlgafoodApiApplication;
import com.erichiroshi.algafood.domain.model.Permissao;
import com.erichiroshi.algafood.domain.repository.PermissaoRepository;

public class CosultaPermissaoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);

		List<Permissao> permissaos = permissaoRepository.listar();

		for (Permissao permissao : permissaos) {
            System.out.printf("%s - %s\n", permissao.getNome(), permissao.getDescricao());
		}
	}

}
