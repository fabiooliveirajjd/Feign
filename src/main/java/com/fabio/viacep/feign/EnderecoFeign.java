package com.fabio.viacep.feign;

import com.fabio.viacep.response.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//INTEGRAÇÕES VIA FEINGN
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws/")
public interface  EnderecoFeign {

    @GetMapping("{cep}/json")
    EnderecoResponse buscaEnderecoCep(@PathVariable("cep")String cep);

}
