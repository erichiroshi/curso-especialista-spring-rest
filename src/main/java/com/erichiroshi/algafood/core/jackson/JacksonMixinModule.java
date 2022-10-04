package com.erichiroshi.algafood.core.jackson;

import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.api.model.mixin.RestauranteMixin;
import com.erichiroshi.algafood.domain.model.Restaurante;
import com.fasterxml.jackson.databind.module.SimpleModule;

@Component
public class JacksonMixinModule extends SimpleModule {
	private static final long serialVersionUID = 1L;

	public JacksonMixinModule() {
		setMixInAnnotation(Restaurante.class, RestauranteMixin.class);
	}

}
