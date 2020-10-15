package com.erichiroshi.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {

	@Override
	public void notificar(Cliente cliente, String msg) {
		System.out.printf("Simulando envio de email: Notificando %s pelo email: %s, msg: %s%n",
				cliente.getNome(), cliente.getEmail(), msg);
	}

}
