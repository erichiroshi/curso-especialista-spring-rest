package com.erichiroshi.algafood.api.assembler;

import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.api.model.input.RestauranteInput;
import com.erichiroshi.algafood.domain.model.Cozinha;
import com.erichiroshi.algafood.domain.model.Restaurante;

@Component
public class RestauranteInputDisassembler {

    public Restaurante toDomainObject(RestauranteInput restauranteInput) {
        Restaurante restaurante = new Restaurante();
        restaurante.setNome(restauranteInput.getNome());
        restaurante.setTaxaFrete(restauranteInput.getTaxaFrete());
        
        Cozinha cozinha = new Cozinha();
        cozinha.setId(restauranteInput.getCozinha().getId());
        
        restaurante.setCozinha(cozinha);
        
        return restaurante;
    }
    
}