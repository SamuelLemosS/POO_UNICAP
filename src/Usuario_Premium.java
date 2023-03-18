/**
 * Usuario_Premion
 */
public class Usuario_Premium extends Usuario{
    private int cartao;

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    Usuario_Premium(String nome, String email, int telefone,int cartao){
        super(nome, email, telefone);
        this.cartao=cartao;
    }

    void pagando(){
        System.out.println("O usuario "+super.getNome()+" esta pagando o premium com o cartao "+cartao);
    }
   
}