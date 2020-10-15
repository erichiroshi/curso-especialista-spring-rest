package com.erichiroshi.algafood.di.notificacao;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.di.modelo.Cliente;

//@Primary
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String msg) {
		System.out.printf("Notificando %s pelo email: %s, msg: %s%n",
				cliente.getNome(), cliente.getEmail(), msg);
	}

}
