package com.example.TurismoWeb.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LocalDTO {
    private Long id;
    private String estado;
    private String cidade;
    private int distancia;
}
