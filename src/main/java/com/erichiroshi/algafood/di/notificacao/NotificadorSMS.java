package com.erichiroshi.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.modelo.Cliente;

@Qualifier("sms")
@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através de SMS %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}