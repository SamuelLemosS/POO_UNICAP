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
//--datas/vazio		       		 		 	 V?
//--datas/listaId/{datasId}	   		 		 V
//--datas/listaMes/{mes}	   		 	 	 V
//--datas/listaAno/{ano}	  		 	 	 V
//--datas/quantidade		  		 	 	 V
//--datas/update/{datasId}				 	 V
//--datas/deleteId/{datasId}			 	 V
//--datas/deleteDiaMesAno/{dia}/{mes}/{ano}	 X
//----------------------------------id/estado/cidade/distancia
//--local/criar												V
//--local/listarTodos										V
//--local/vazio												V?
//--local/listaId/{localId}									V
//--local/listaCidade/{cidade}								V
//--local/listaEstado/{estado}								V
//--local/quantidade										V
//--local/update/{localId}									V
//--local/deleteId/{localId}								V
//--local/deleteDistanciaCidade/{distancia}/{cidade}		X
//----------------------------------id/nome/valor/dataModel/localModel
//--destino/criar								V
//--destino/listarTodos							V
//--destino/vazio								V?
//--destino/listaId/{destinoId}					V
//--destino/listaNome/{nome}					V
//--destino/listaValor/{valor}					V
//--destino/listaNomeValor/{nome}/{valor}		V
//--destino/quantidade							V
//--destino/update/{destinoId}					V
//--destino/deleteId/{destinoId}				V
//--destino/deleteNomeValor/{nome}/{valor}		X
//-------------------------------------id/ddd/numero
//--telefone/criar								V
//--telefone/listarTodos						V
//--telefone/vazio								V?
//--telefone/listaId/{telefoneId}				V
//--telefone/listaDdd/{ddd}						V
//--telefone/quantidade							V
//--telefone/update/{telefoneId}				V
//--telefone/deleteId/{telefoneId}				V
//--telefone/deleteDddNumero/{ddd}/{numero}		X
//-------------------------------------id/nome/email/telefoneModel/destinoModel/diaSemPremium
//--clientes/criar								V
//--clientes/listarTodos						V
//--clientes/vazio								V?
//--clientes/listaId/{clienteId}				V
//--clientes/listaNomeEmail/{nome}/{email}		V
//--clientes/quantidade							V
//--clientes/update/{clienteId}					V
//--clientes/deleteId/{clienteId}				V
//--clientes/deleteNomeEmail/{nome}/{email}		X
//-------------------------------------id/nome/email/telefoneModel/destinoModel/Agencia/diaDePremium
//--clientesPremium/criar									V
//--clientesPremium/listarTodos								V
//--clientesPremium/vazio									V?
//--clientesPremium/maisPremium								V
//--clientesPremium/listaId/{clientePremiumId}				V
//--clientesPremium/listaAgencia/{agencia}					V
//--clientesPremium/listaDiasDePremium/{diasDePremium}		V
//--clientesPremium/listaNomeEmail/{nome}/{email}			V
//--clientesPremium/quantidade								V
//--clientesPremium/update/{clientePremiumId}				V
//--clientesPremium/deleteId/{clientePremiumId}				V
//--clientesPremium/deleteNomeEmail/{nome}/{email}			X

