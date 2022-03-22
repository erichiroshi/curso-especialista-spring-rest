package com.erichiroshi.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.erichiroshi.algafood.AlgafoodApiApplication;
import com.erichiroshi.algafood.domain.model.FormaPagamento;
import com.erichiroshi.algafood.domain.repository.FormaPagamentoRepository;

public class CosultaFormaPagamentoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);

		List<FormaPagamento> formaPagamentos = formaPagamentoRepository.listar();

		for (FormaPagamento formaPagamento : formaPagamentos) {
			System.out.println(formaPagamento.getDescricao());
		}
	}

}
