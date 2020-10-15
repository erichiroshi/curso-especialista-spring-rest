package com.erichiroshi.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String msg) {
		System.out.printf("Notificando %s por SMS pelo telefone %s, msg: %s%n",
				cliente.getNome(), cliente.getTelefone(), msg);
	}

}
