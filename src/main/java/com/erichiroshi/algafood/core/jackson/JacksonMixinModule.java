package com.erichiroshi.algafood.core.jackson;

import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.api.model.mixin.CidadeMixin;
import com.erichiroshi.algafood.api.model.mixin.CozinhaMixin;
import com.erichiroshi.algafood.domain.model.Cidade;
import com.erichiroshi.algafood.domain.model.Cozinha;
import com.fasterxml.jackson.databind.module.SimpleModule;

@Component
public class JacksonMixinModule extends SimpleModule {
	private static final long serialVersionUID = 1L;

	public JacksonMixinModule() {
		setMixInAnnotation(Cidade.class, CidadeMixin.class);
		setMixInAnnotation(Cozinha.class, CozinhaMixin.class);
	}

}
