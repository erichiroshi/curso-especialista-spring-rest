package com.erichiroshi.algafood.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.api.model.input.RestauranteInput;
import com.erichiroshi.algafood.domain.model.Restaurante;

@Component
public class RestauranteInputDisassembler {

	@Autowired
	private ModelMapper modelMapper;

	public Restaurante toDomainObject(RestauranteInput restauranteInput) {

		return modelMapper.map(restauranteInput, Restaurante.class);
	}

}