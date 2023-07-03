package com.fabio.viacep.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*@Entity*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoRequest {

 /*   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEndereco")
    private Long id;*/
    private String cep;
}
