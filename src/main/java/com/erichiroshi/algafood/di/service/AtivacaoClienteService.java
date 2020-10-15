package com.erichiroshi.algafood.di.service;

import com.erichiroshi.algafood.di.modelo.Cliente;
import com.erichiroshi.algafood.di.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;

		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
	}
}
