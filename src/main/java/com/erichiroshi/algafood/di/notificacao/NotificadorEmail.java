package com.erichiroshi.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.modelo.Cliente;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String msg) {
		System.out.printf("Notificando %s através do email %s: %s%n",
				cliente.getNome(), cliente.getEmail(), msg);
	}

}
