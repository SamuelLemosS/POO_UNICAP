import java.util.ArrayList;
public class Cliente {
    private int id;
    private String nome;
    private String email;
    private ArrayList<Telefone> telefone = new ArrayList<Telefone>();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Telefone> getTelefone() {
        return telefone;
    }
    public void setTelefone(ArrayList<Telefone> telefone) {
        this.telefone = telefone;
    }
    public void addTelefone(Telefone newTelefone){
        this.telefone.add(newTelefone);
    }
    public Cliente(int id, String nome, String email, ArrayList<Telefone> telefone) {
    }
}
