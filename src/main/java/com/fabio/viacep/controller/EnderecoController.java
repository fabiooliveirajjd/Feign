package com.fabio.viacep.controller;

import com.fabio.viacep.request.EnderecoRequest;
import com.fabio.viacep.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor //para o método private final
@RequestMapping("/enderecos")
@RestController
public class EnderecoController {


    private final EnderecoService enderecoService;

    @GetMapping("/consulta")
    public ResponseEntity consultaCep(@RequestBody EnderecoRequest enderecoRequest){
       // System.out.println(enderecoRequest.getCep());
       // enderecoService.executa(enderecoRequest);
        return  ResponseEntity.ok(enderecoService.executa(enderecoRequest));
    }
}

