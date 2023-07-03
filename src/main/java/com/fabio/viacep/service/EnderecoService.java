package com.fabio.viacep.service;

import com.fabio.viacep.feign.EnderecoFeign;
import com.fabio.viacep.request.EnderecoRequest;
import com.fabio.viacep.response.EnderecoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnderecoService {

    private final EnderecoFeign enderecoFeign;
    public EnderecoResponse executa (EnderecoRequest request){
    return  enderecoFeign.buscaEnderecoCep(request.getCep());
    }
}
