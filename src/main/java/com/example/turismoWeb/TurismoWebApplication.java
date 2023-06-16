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


//------------------------------------------id/dia/mes/ano
//--datas/criar               		 V
//--datas/listarTodos          		 V
//--datas/semDia		       		 V
//--datas/listaId/{datasId}	   		 X
//--datas/listaMes/{mes}	   		 X
//--datas/listaAno/{ano}	  		 X
//--datas/quantidade		  		 V
//--datas/delete/{datasId}			 V
//--datas/delete/{dia}/{mes}/{ano}	 X
//--datas/update/{datasId}			 V
//----------------------------------id/estado/cidade/distancia
//--local/criar								V
//--local/listarTodos						V
//--local/vazio								V
//--local/lista/{localId}					X
//--local/lista/{cidade}					X
//--local/lista/{estado}					X
//--local/quantidade						V
//--local/delete/{localId}					V
//--local/delete/{distancia}/{cidade}		X
//--local/update/{localId}					V
//----------------------------------id/nome/valor/data/local
//--destino/criar						V
//--destino/listarTodos					V
//--destino/vazio						V
//--destino/lista/{destinoId}			X
//--destino/lista/{nome}				X
//--destino/lista/{valor}
//--destino/lista/{nome}/{valor}
//--destino/quantidade					V
//--destino/delete/{destinoId}			V
//--destino/delete/{nome}/{valor}
//--destino/update/{destinoId}			V
//-------------------------------------id/ddd/numero
//--telefone/criar
//--telefone/listarTodos
//--telefone/vazio
//--telefone/lista/{telefoneId}
//--telefone/lista/{ddd}
//--telefone/quantidade
//--telefone/delete/{telefoneId}
//--telefone/delete/{ddd}/{numero}
//--telefone/update/{telefoneId}
//-------------------------------------id/nome/email/telefone/destino/diaSemPremium
//--clientes/criar
//--clientes/listarTodos
//--clientes/lista/{clienteId}
//--clientes/quantidade
//--clientes/semNomeEmail
//--clientes/achar/{nome}/{email}
//--clientes/delete/{nome}/{email}
//--clientes/delete/{clienteId}
//--clientes/update/{clienteId}
//-------------------------------------id/nome/email/telefone/destino/Agencia/diaDePremium
//--clientesPremium/criar
//--clientesPremium/listarTodos
//--clientesPremium/maisPremium
//--clientesPremium/semNomeEmail
//--clientesPremium/lista/{clientePremiumId}
//--clientesPremium/lista/{agencia}
//--clientesPremium/lista/{diasDePremium}
//--clientesPremium/achar/{nome}/{email}
//--clientesPremium/quantidade
//--clientesPremium/delete/{clientePremiumId}
//--clientesPremium/delete/{nome}/{email}
//--clientesPremium/update/{clientePremiumId}
