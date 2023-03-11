public class App {
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario("Samuel", "samuel@gamil.com", 999999999);
        Usuario_Premium userP = new Usuario_Premium("davi", "davi@gmail.com", 994829385, 133);
        user.ouvindo();
        userP.pagando();
    }
}
