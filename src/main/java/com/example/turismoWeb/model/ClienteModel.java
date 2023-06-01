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

public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	@OneToMany(mappedBy = "cliente")
	private List<TelefoneModel> telefoneModel;
	@ManyToMany(mappedBy = "cliente")
	private List<DestinoModel> destinosComprados;
}
