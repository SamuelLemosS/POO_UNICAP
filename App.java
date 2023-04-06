import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Animal bicho = new Animal();
        bicho.nascer();
        boolean sair = false;
        while (sair == false) {
            System.out.println("O que quer fazer:\n1-Comer\n2-Correr\n3-Dormir\n4-Sair do programa");
            int fazer = scanner.nextInt();
            switch (fazer) {
                case 1:
                    bicho.comer();
                    break;
                case 2:
                    bicho.correr();
                    break;
                case 3:
                    bicho.dormir();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Digite um número valido");
                    break;
            }
        }
        System.out.println("Você saiu do programa");
    }
}
