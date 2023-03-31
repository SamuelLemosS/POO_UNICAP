public class Universidade {
    private String nome;
    private String lugar;
    private Curso curso;
    private Professor Professor;

    public Universidade() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Professor getProfessor() {
        return Professor;
    }
    public void setProfessor(Professor professor) {
        Professor = professor;
    }
}
