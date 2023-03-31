public class Curso {
    private String nome;
    private int qtnPeriodo;
    private Professor professor;
    private Universidade universidade;
    private Turma turma;

    public Curso(){
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtnPeriodo() {
        return qtnPeriodo;
    }
    public void setQtnPeriodo(int qtnPeriodo) {
        this.qtnPeriodo = qtnPeriodo;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Universidade getUniversidade() {
        return universidade;
    }
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
