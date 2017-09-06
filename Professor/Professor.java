
public class Professor
{
    private String nome;
    private int matricula;
    private double salario;
    
    public String getNome() {
        return this.nome;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setNome(String _nome) {
        this.nome = _nome;
    }
    
    public void setMatricula(int _matricula) {
        this.matricula = _matricula;
    }
    
    public void setSalario(double _salario) {
        this.salario = _salario;
    }
}
