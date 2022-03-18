package com.erichiroshi.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.erichiroshi.algafood.di.modelo.Cliente;
import com.erichiroshi.algafood.di.notificacao.NivelUrgencia;
import com.erichiroshi.algafood.di.notificacao.Notificador;
import com.erichiroshi.algafood.di.notificacao.TipoDoNotificador;

//@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

	public AtivacaoClienteService() {
		System.out.println("Ativação Cliente Service");
	}

//	@PostConstruct
	private void init() {
		System.out.println("init");
	}

//	@PreDestroy
	private void destroy() {
		System.out.println("destroy");
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
