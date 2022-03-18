package com.erichiroshi.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorMockEmail implements Notificador {
	
	public NotificadorMockEmail() {
		System.out.println("Noficador Email Mock");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Mock: Notificação seria enviada para %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}