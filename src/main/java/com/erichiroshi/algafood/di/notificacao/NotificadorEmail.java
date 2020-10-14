package com.erichiroshi.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {

	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar(Cliente cliente, String msg) {
		System.out.printf("Notificando %s pelo email: %s, msg: %s%n", cliente.getNome(), cliente.getEmail(), msg);
	}

}
