public class Musica {
    private String nome;
    private String genero;
    private String artista;
    private float duracao;

    Musica(String nome, String genero,String artista, float duracao){
        this.nome=nome;
        this.genero=genero;
        this.artista=artista;
        this.duracao=duracao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public float getDuracao() {
        return duracao;
    }
    public void setDuracao(Float duracao) {
        this.duracao = duracao;
    }

}
