package com.example.TurismoWeb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class DestinoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToMany(mappedBy = "destino")
    	private DatasModel datasModel;
	@ManyToMany(mappedBy = "destino")
    	private LocalModel localModel;
    	private float valor;
}
