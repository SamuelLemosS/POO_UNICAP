package com.example.TurismoWeb.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class ClientePremiumModel extends ClienteModel {
	private int cartao;
	private String agencia;
	private int diasDePremium;
}
