package com.example.TurismoWeb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;
}
