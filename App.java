import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            Registro app = new Registro();
            boolean sair = false;
            while (sair == false) {
                System.out.println("O que quer fazer:\n1-Cadastrar Cliente\n2-Listar Cliente\n3-Excluir Cliente\n4-Sair do programa");
                int fazer = scanner.nextInt();
                switch (fazer) {
                    case 1:
                        app.cadastrar();
                        break;
                    case 2:
                        app.listar();
                        break;
                    case 3:
                        app.excluir();
                        break;
                    case 4:
                        sair = true;
                        break;
                    default:
                        System.out.println("Digite um número valido");
                        break;
                }
            }
        }
        System.out.println("Você saiu do programa");
    }
}
