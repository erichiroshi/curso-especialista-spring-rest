package com.erichiroshi.algafood.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.api.model.input.CozinhaInput;
import com.erichiroshi.algafood.domain.model.Cozinha;

@Component
public class CozinhaInputDisassembler {

    @Autowired
    private ModelMapper modelMapper;
    
    public Cozinha toDomainObject(CozinhaInput cozinhaInput) {
        return modelMapper.map(cozinhaInput, Cozinha.class);
    }
    
    public void copyToDomainObject(CozinhaInput cozinhaInput, Cozinha cozinha) {
        modelMapper.map(cozinhaInput, cozinha);
    }
    
} 