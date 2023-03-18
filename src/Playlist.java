public class Playlist {
    private String nome;
    private int quantidadeMusica;
    private float duracaoTotal;

    Playlist(String nome, int quantidadeMusica, Float duracaoTotal){
        this.nome=nome;
        this.quantidadeMusica=quantidadeMusica;
        this.duracaoTotal=duracaoTotal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeMusica() {
        return quantidadeMusica;
    }
    public void setQuantidadeMusica(int quantidadeMusica) {
        this.quantidadeMusica = quantidadeMusica;
    }
    public float getDuracaoTotal() {
        return duracaoTotal;
    }
    public void setDuracaoTotal(Float duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

}
