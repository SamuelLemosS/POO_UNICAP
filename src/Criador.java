public class Criador{
    private String artista;
    private String genero;

    Criador(String artista, String genero){
        this.artista= artista;
        this.genero= genero;
    }

    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

}