package com.erichiroshi.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.modelo.Cliente;

@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher event;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		event.publishEvent(new ClienteAtivadoEvent(cliente));
	}
}
