package com.example.turismoWeb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass

public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	@OneToMany
	private List<com.example.turismoWeb.model.TelefoneModel> telefoneModel;
	@ManyToMany
	private List<DestinoModel> destinoModel;
}
