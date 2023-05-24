package com.example.TurismoWeb.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TelefoneDTO {
    private Long id;
    private String ddd;
    private String numero;
}
