package com.example.TurismoWeb.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DatasDTO {
    private Long id;
    private int dia;
    private int mes;
    private int ano;
}
