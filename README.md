# POO_UNICAP

O Banco é uma instituição financeira que oferece serviços bancários aos clientes. O Registro é um sistema de cadastro, listagem e exclusão de clientes. O Cliente é uma pessoa física que tem uma ou mais contas bancárias no banco. A Conta é um serviço bancário que permite ao cliente guardar e movimentar dinheiro. O Telefone e Endereço são informações adicionais que os clientes podem fornecer para contato e identificação.

Na tela inical, o programa deve apresentar um menu com as opções de 1-cadastrar cliente, 2-listar clientes, 3-excluir clientes e 4-sair do programa. As opções 1 a 3 são funções implementadas no Registro.

O Registro é composto por uma lista de clientes da qual é possível inserir novos clientes, fornecendo as informações necessárias, como CPF, Nome, Contas, Endereço e Telefones. Também é possível listar todos os clientes já cadastrados no sistema, exibindo suas informações, como CPF, Nome, Contas, Endereço e Telefones. Além disso, é possível excluir clientes específicos do sistema, removendo todas as informações relacionadas a eles, incluindo suas Contas, Endereço e Telefones associados. Apenas reiterando, essas opções de cadastro, listagem e exclusão de clientes devem estar disponíveis no menu principal do sistema.

Um Cliente é composto por um CPF, que é um número de identificação único, um Nome, várias Contas bancárias, um Endereço e vários Telefones. Cada Conta bancária é composta por um número de conta, uma agência e um saldo atual. Além disso, cada Conta bancária deve implementar as funções de extrato, depósito e saque que permitam ao Cliente modificar ou listar o saldo da conta.

O Endereço do Cliente é composto por um CEP, que é um código postal único que identifica uma área geográfica específica, um Logradouro, que é o nome da rua ou avenida onde o Cliente reside, e um número que identifica o endereço específico do Cliente. Cada Cliente pode ter apenas um Endereço.

Cada Telefone do Cliente é composto por um DDD e um número de telefone. Cada Cliente pode ter um ou mais Telefones associados a ele.

OBS: Todas as classes tem que conter os getters/setters dos atributos
OBS2: Utilizem private e public adequadamente
