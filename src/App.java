public class App {
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario("Samuel", "samuel@gamil.com", 999999999);
        Usuario_Premium userP = new Usuario_Premium("davi", "davi@gmail.com", 994829385, 133);
        Criador cria= new Criador("yung lixo", "shit trap");
        Musica musi= new Musica("supersticiosa","hap","haikaiss",5.30f);
        Playlist play= new Playlist("sla",7,36.56f);
        System.out.println(musi.getArtista());
        play.setQuantidadeMusica(8);
        play.setDuracaoTotal(39.02f);
        cria.setGenero("trap");
        System.out.println(cria.getGenero());
        user.ouvindo();
        userP.pagando();
    }
}
