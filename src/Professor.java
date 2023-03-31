
public class Professor {
    private String nome;
    private String ra;
    private Curso curso;
    private Universidade universidade;
    public Professor() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Universidade getUniversidade() {
        return universidade;
    }
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
}
