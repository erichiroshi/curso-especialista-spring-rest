package com.erichiroshi.algafood.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.erichiroshi.algafood.api.model.ProdutoModel;
import com.erichiroshi.algafood.domain.model.Produto;

@Component
public class ProdutoModelAssembler {

    @Autowired
    private ModelMapper modelMapper;
    
    public ProdutoModel toModel(Produto produto) {
        return modelMapper.map(produto, ProdutoModel.class);
    }
    
    public List<ProdutoModel> toCollectionModel(List<Produto> produtos) {
        return produtos.stream()
                .map(produto -> toModel(produto))
                .collect(Collectors.toList());
	}
}