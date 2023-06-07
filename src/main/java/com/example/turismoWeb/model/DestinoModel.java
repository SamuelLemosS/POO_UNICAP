package com.example.turismoWeb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class DestinoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private float valor;
	@ManyToMany
    	private List<DatasModel> datasModel;
	@ManyToMany
    	private List<LocalModel> localModel;
}
