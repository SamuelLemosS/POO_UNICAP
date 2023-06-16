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
//--datas/criar               		 		 V
//--datas/listarTodos          		 		 V
//--datas/vazio		       		 		 V
//--datas/listaId/{datasId}	   		 		 X
//--datas/listaMes/{mes}	   		 	 	 X
//--datas/listaAno/{ano}	  		 	 	 X
//--datas/quantidade		  		 	 	 V
//--datas/update/{datasId}				 	 V
//--datas/deleteId/{datasId}			 	 V
//--datas/deleteDiaMesAno/{dia}/{mes}/{ano}	 X
//----------------------------------id/estado/cidade/distancia
//--local/criar								V
//--local/listarTodos						V
//--local/vazio								V
//--local/listaId/{localId}					X
//--local/listaCidade/{cidade}					X		(model)
//--local/listaEstado/{estado}					X		(model)
//--local/quantidade						V
//--local/update/{localId}					V
//--local/deleteId/{localId}					V
//--local/deleteDistanciaCidade/{distancia}/{cidade}		X
//----------------------------------id/nome/valor/data/local
//--destino/criar						V
//--destino/listarTodos					V
//--destino/vazio						V
//--destino/listaId/{destinoId}			X
//--destino/listaNome/{nome}				X
//--destino/listaValor/{valor}
//--destino/listaNomeValor/{nome}/{valor}
//--destino/quantidade					V
//--destino/update/{destinoId}			V
//--destino/deleteId/{destinoId}			V
//--destino/deleteNomeValor/{nome}/{valor}
//-------------------------------------id/ddd/numero
//--telefone/criar
//--telefone/listarTodos
//--telefone/vazio
//--telefone/listaId/{telefoneId}
//--telefone/listaDdd/{ddd}
//--telefone/quantidade
//--telefone/update/{telefoneId}
//--telefone/deleteId/{telefoneId}
//--telefone/deleteDddNumero/{ddd}/{numero}
//-------------------------------------id/nome/email/telefone/destino/diaSemPremium
//--clientes/criar
//--clientes/listarTodos
//--clientes/vazio
//--clientes/listaId/{clienteId}
//--clientes/listaNomeEmail/{nome}/{email}
//--clientes/quantidade
//--clientes/update/{clienteId}
//--clientes/deleteId/{clienteId}
//--clientes/deleteNomeEmail/{nome}/{email}
//-------------------------------------id/nome/email/telefone/destino/Agencia/diaDePremium
//--clientesPremium/criar
//--clientesPremium/listarTodos
//--clientesPremium/vazio
//--clientesPremium/maisPremium
//--clientesPremium/listaId/{clientePremiumId}
//--clientesPremium/listaAgencia/{agencia}
//--clientesPremium/listaDiasDePremium/{diasDePremium}
//--clientesPremium/listaNomeEmail/{nome}/{email}
//--clientesPremium/quantidade
//--clientesPremium/update/{clientePremiumId}
//--clientesPremium/deleteId/{clientePremiumId}
//--clientesPremium/deleteNomeEmail/{nome}/{email}

