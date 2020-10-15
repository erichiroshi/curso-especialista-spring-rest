package com.erichiroshi.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.erichiroshi.algafood.di.notificacao.Notificador;
import com.erichiroshi.algafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}
