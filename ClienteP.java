import java.util.ArrayList;
public class ClienteP extends Cliente {
    private int cartao;
    private int diasP;
    private String agencia;

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public int getDiasP() {
        return diasP;
    }

    public void setDiasP(int diasP) {
        this.diasP = diasP;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    ClienteP(int id, String nome, String email,ArrayList<Telefone> telefone) {
        super(id,nome,email,telefone);
    }
}
