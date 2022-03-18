package com.erichiroshi.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.modelo.Cliente;
import com.erichiroshi.algafood.di.notificacao.NivelUrgencia;
import com.erichiroshi.algafood.di.notificacao.Notificador;
import com.erichiroshi.algafood.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
