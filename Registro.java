import java.util.ArrayList;
import java.util.Scanner;;
public class Registro {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    Scanner scanner = new Scanner(System.in);
    public Registro() {
    }
    public ArrayList<Cliente> getCliente() {
        return clientes;
    }
    public void setCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente novoCliente(){
        Cliente cliente = new Cliente();
        System.out.println("Digite o nome do cliente:");
        cliente.setNome(scanner.nextLine());
        System.out.println("Digite o CPF do cliente:");
        cliente.setCpf(scanner.nextInt());
        return cliente;
    }
    public Endereco endCliente(){
        Endereco endereco = new Endereco();
        System.out.println("Digite o numero do endereco do cliente:");
        endereco.setNumero(scanner.nextInt());
        System.out.println("Digite o CEP do endereco do cliente:");
        endereco.setCep(scanner.nextInt());
        System.out.println("Digite o logadouro do endereco do cliente:");
        endereco.setLogadouro(scanner.nextLine());
        return endereco;
    }
    public Telefone telCliente(){
        Telefone telefone = new Telefone();
        System.out.println("Digite o DDD do telefone do cliente:");
        telefone.setDdd(scanner.nextInt());
        System.out.println("Digite o numero do telefone do cliente:");
        telefone.setNumero(scanner.nextInt());
        return telefone;
        
    }
    public Conta contaCliente(){
        Conta conta = new Conta();
        System.out.println("Digite o numero da conta do cliente:");
        conta.setNumero(scanner.nextInt());
        System.out.println("Digite a agencia da conta do cliente:");
        conta.setAgencia(scanner.nextLine());
        System.out.println("Digite o saldo da conta do cliente:");
        conta.setSaldo(scanner.nextFloat());
        return conta;
    }
    public void cadastrar(){
        Cliente cliente = novoCliente();
        Endereco endereco = endCliente();
        cliente.setEndereco(endereco);
        
        System.out.println("O cliente tera quantos telefones?");
        int qntT=scanner.nextInt();
        for(int i=1;i<=qntT;i++){
            Telefone telefone = telCliente();
            cliente.addTelefone(telefone);
        }
        
        System.out.println("O cliente tera quantas Contas?");
        int qntC=scanner.nextInt();
        for(int i=1;i<=qntC;i++){
            Conta conta = contaCliente();
            cliente.addConta(conta);
        }
        clientes.add(cliente);
    }
    public void listar(){
        System.out.println("Nome|CPF|Numero|CEP|Logadouro|DDD+Telefone|Numero|Agencia|Saldo");
            for(int i=0;i<clientes.size();i++){
                System.out.print(clientes.get(i).getNome()+"|");
                System.out.print(clientes.get(i).getCpf()+"|");
                System.out.print(clientes.get(i).getEndereco().getNumero()+"|");
                System.out.print(clientes.get(i).getEndereco().getCep()+"|");
                System.out.print(clientes.get(i).getEndereco().getLogadouro()+"|");
                for(int j=0;j<clientes.get(i).getTelefone().size();j++){
                    System.out.print(clientes.get(i).getTelefone().get(j).getDdd()+" ");
                    System.out.print(clientes.get(i).getTelefone().get(j).getDdd());
                    System.out.print(",");
                }
                System.out.print("|");
                for(int l=0;l<clientes.get(i).getConta().size();l++){
                    System.out.print(clientes.get(i).getConta().get(l).getNumero()+"|");
                    System.out.print(clientes.get(i).getConta().get(l).getAgencia()+"|");
                    System.out.print(clientes.get(i).getConta().get(l).getSaldo()+"|");
                    System.out.print(",");
                }
                System.out.print("|");
                System.out.println("");
            }
    }
    public void excluir() {
        System.out.println("Deseja apagar a conta de qual cliente? Digite o nome do cliente");
        String apagar = scanner.next();
        int i = 0;
        while (i < clientes.size() && !apagar.equals(clientes.get(i).getNome())) {
            i++;
        }
        if (i < clientes.size()) {
            System.out.println("Cliente " + clientes.get(i).getNome() + " apagado com sucesso");
            clientes.remove(i);
        } else {
            System.out.println("Digite o nome do cliente corretamente");
        }
    }
}
