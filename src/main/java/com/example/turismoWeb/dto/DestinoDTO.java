package com.example.turismoWeb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DestinoDTO {
    private Long id;
    private String nome;
    private float valor;
}
