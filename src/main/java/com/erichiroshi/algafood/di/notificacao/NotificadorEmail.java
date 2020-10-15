package com.erichiroshi.algafood.di.notificacao;

import com.erichiroshi.algafood.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	private String hostServidorSmtp;

	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar(Cliente cliente, String msg) {
		if(caixaAlta)
			msg = msg.toUpperCase();
		
		System.out.printf("Notificando %s pelo email: %s usando SMTP %s, msg: %s%n",
				cliente.getNome(), cliente.getEmail(), hostServidorSmtp, msg);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
