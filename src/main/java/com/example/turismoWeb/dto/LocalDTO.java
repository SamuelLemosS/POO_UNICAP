package com.example.turismoWeb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LocalDTO {
    private Long id;
    private String estado;
    private String cidade;
    private int distancia;
}
