/**
 * Usuario_Premion
 */
public class Usuario_Premium extends Usuario{
    int cartao;
    Usuario_Premium(String nome, String email, int telefone,int cartao){
        super(nome, email, telefone);
        this.cartao=cartao;
    }

    void pagando(){
        System.out.println("O usuario "+nome+" esta pagando o premium com o cartao "+cartao);
    }
   
}