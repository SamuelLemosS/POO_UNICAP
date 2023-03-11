/**
 * Perfil
 */
public class Usuario {
    String nome;
    String email;
    int telefone;

    Usuario(String nome, String email, int telefone){
        this.nome=nome;
        this.email=email;
        this.telefone=telefone;
    }
    
    void ouvindo(){
        System.out.println("O usuario "+nome+" esta escutando musica");
    }
}