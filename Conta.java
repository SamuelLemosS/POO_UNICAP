import java.util.Scanner;
public class Conta {

    Scanner sc = new Scanner(System.in);

    private int numero;
    private String agencia;
    private float saldo;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public Conta() {
        saldo=0f;
    }

    public void extrato(){
        System.out.println(getSaldo());
    }
    public void deposito(){
        System.out.println("Digite o valor do deposito");
        setSaldo(getSaldo()+sc.nextFloat());
        System.out.println(getSaldo());
    }
    public void saque(){
        System.out.println("Digite o valor do saque");
        setSaldo(getSaldo()-sc.nextFloat());
        System.out.println(getSaldo());
    }
}
