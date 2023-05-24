package com.example.TurismoWeb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass

public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	@OneToMany(mappedBy = "cliente")
	private List<Telefone> telefone;
	@ManyToMany(mappedBy = "cliente")
	private List<Destino> destinosComprados;
	@ManyToMany(mappedBy = "cliente")
	private List<Destino> destinosVisitados;
}