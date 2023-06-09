package com.example.turismoWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TurismoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurismoWebApplication.class, args);
	}

}


//-------------------------------------
//--clientes/criar
//--clientes/listarTodos
//--clientes/lista/{clienteId}
//--clientes/quantidae
//--clientes/semNomeEmail
//--clientes/achar/{nome}/{email}
//--clientes/delete/{nome}/{email}
//--clientes/delete/{clienteId}
//--clientes/update/{clienteId}
//-------------------------------------
//--clientesPremium/criar
//--clientesPremium/listarTodos
//--clientesPremium/maisPremium
//--clientesPremium/semNomeEmail
//--clientesPremium/lista/{clientePremiumId}
//--clientesPremium/lista/{agencia}
//--clientesPremium/lista/{diasDePremium}
//--clientesPremium/achar/{nome}/{email}
//--clientesPremium/quantidae
//--clientesPremium/delete/{clientePremiumId}
//--clientesPremium/delete/{nome}/{email}
//--clientesPremium/update/{clientePremiumId}
//------------------------------------------
//--datas/criar
//--datas/listarTodos
//--datas/semDia
//--datas/lista/{datasId}
//--datas/lista/{mes}
//--datas/lista/{ano}
//--datas/quantidae
//--datas/delete/{datasId}
//--datas/delete/{dia}/{mes}/{ano}
//--datas/update/{datasId}
//----------------------------------
//--destino/criar
//--destino/listarTodos
//--destino/vazio
//--destino/lista/{destinoId}
//--destino/lista/{nome}
//--destino/lista/{valor}
//--destino/lista/{nome}/{valor}
//--destino/quantidae
//--destino/delete/{destinoId}
//--destino/delete/{nome}/{valor}
//--destino/update/{destinoId}
//----------------------------------
//--local/criar
//--local/listarTodos
//--local/vazio
//--local/lista/{localId}
//--local/lista/{cidade}
//--local/lista/{estado}
//--local/quantidae
//--local/delete/{localId}
//--local/delete/{distancia}/{cidade}
//--local/update/{localId}
//-------------------------------------
//--telefone/criar
//--telefone/listarTodos
//--telefone/vazio
//--telefone/lista/{telefoneId}
//--telefone/lista/{ddd}
//--telefone/quantidae
//--telefone/delete/{telefoneId}
//--telefone/delete/{ddd}/{numero}
//--telefone/update/{telefoneId}