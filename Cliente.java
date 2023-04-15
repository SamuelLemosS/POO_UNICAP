import java.util.ArrayList;
public class Cliente {
    private int cpf;
    private String nome;
    private Endereco endereco;
    private ArrayList<Telefone> telefone = new ArrayList<Telefone>();
    private ArrayList<Conta> conta = new ArrayList<Conta>();
    public Cliente() {
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Telefone> getTelefone() {
        return telefone;
    }
    public void setTelefone(ArrayList<Telefone> telefone) {
        this.telefone = telefone;
    }
    public ArrayList<Conta> getConta() {
        return conta;
    }
    public void setConta(ArrayList<Conta> conta) {
        this.conta = conta;
    }

    public void addTelefone(Telefone newTelefone){
        this.telefone.add(newTelefone);
    }
    public void addConta(Conta newConta){
        this.conta.add(newConta);
    }

}
