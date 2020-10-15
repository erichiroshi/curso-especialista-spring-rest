package com.erichiroshi.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erichiroshi.algafood.di.modelo.Cliente;
import com.erichiroshi.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;

	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("João", "joao@gmail.com", "3499998888");
		
		ativacaoClienteService.ativar(joao);
		return "Hello Spring é nóis";
	}
}
