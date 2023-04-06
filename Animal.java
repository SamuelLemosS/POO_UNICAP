import java.util.Scanner;
public class Animal {
    Scanner scanner = new Scanner(System.in); 
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private Boolean estado;
    private int caloria;
    private int forca;
    public Animal() {}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public int getCaloria() {
        return caloria;
    }
    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

    public void nascer(){
        System.out.println("Nome do animal");
        setNome(scanner.nextLine());
        System.out.println("Classe do animal");
        setClasse(scanner.nextLine());
        System.out.println("Familia do animal");
        setFamilia(scanner.nextLine());
        setIdade(0);
        setForca(10);
        setCaloria(10);
        setEstado(true);
        System.out.println("O animal se chama " + getNome() + " é da classe " + getClasse() + " da familia " + getFamilia() + ". O animal possui força de " + getForca() + ", caloria de " + getCaloria() + " e idade de " +getIdade());
    }
    public void morrer(){
        setForca(0);
        setEstado(false);
        System.out.println("O animal morreu!");
    }

    public void comer(){
        if (getCaloria()<100 && getEstado()==true){
            setCaloria(getCaloria()+10);
            setForca(getForca()-2);
        }
        if(getCaloria()==0){
            morrer();
        }else{
            System.out.println("O animal comeu e agora sua força é de " + getForca() +" e suas calorias valem " + getCaloria());
        }
    }

    public void correr(){
        if(getCaloria()!=0 && getEstado()==true){
            setCaloria(getCaloria()-5);
            setForca(getForca()-5);
        }
        if(getCaloria()==0){
            morrer();
        }else{
        System.out.println( "O animal está correndo!! Agora sua força é de " + getForca() + " e suas calorias valem " + getCaloria());
        }
    }

    public void dormir(){
        if(getEstado()==true){
            setCaloria(getCaloria()-2);
            setForca(getForca()+10);
        }
        if(getCaloria()==0){
            morrer();
        }else{
        System.out.println(  "O animal está domingo agora! Sua força aumentou para " + getForca() + " e suas calorias aumentaram para " + getCaloria());
        }
    }
}
