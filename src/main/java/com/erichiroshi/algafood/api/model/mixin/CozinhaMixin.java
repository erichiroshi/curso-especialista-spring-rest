package com.erichiroshi.algafood.api.model.mixin;

import java.util.ArrayList;
import java.util.List;

import com.erichiroshi.algafood.domain.model.Restaurante;
import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class CozinhaMixin {

	@JsonIgnore
	private List<Restaurante> restaurantes = new ArrayList<>();
}
