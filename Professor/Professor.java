public class Professor
{
    private String nome;
    private int matricula;
    private double salario;
    
    public Professor() {
    }
    
    public Professor(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
