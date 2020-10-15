package com.erichiroshi.algafood;

import org.springframework.context.annotation.Bean;

import com.erichiroshi.algafood.di.notificacao.NotificadorEmail;
import com.erichiroshi.algafood.di.service.AtivacaoClienteService;

//@Configuration
public class AlgaConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);

		return notificador;
	}

	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
}
