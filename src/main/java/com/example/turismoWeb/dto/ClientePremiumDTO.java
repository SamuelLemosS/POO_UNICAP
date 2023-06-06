package com.example.TurismoWeb.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class ClientePremiumDTO extends ClienteDTO{
    private Long id;
    private int cartao;
    private String agencia;
    private int diasDePremium;

}
