package com.erichiroshi.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.notificacao.NivelUrgencia;
import com.erichiroshi.algafood.di.notificacao.Notificador;
import com.erichiroshi.algafood.di.notificacao.TipoDoNotificador;
import com.erichiroshi.algafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}

}