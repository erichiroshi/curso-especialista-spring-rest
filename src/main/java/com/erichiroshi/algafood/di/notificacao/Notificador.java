package com.erichiroshi.algafood.di.notificacao;

import com.erichiroshi.algafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}