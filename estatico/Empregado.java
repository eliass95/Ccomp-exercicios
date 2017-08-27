import com.sun.org.apache.xerces.internal.impl.dv.xs.DoubleDV;

public class Empregado
{
    private int id;
    private String nome;
    private double salario;
    private static int proximoId = 1;
    
    public Empregado(String nome, double salario)
    {
        this.nome = nome;
        this.salario = salario;
        this.id = proximoId;
        proximoId++;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public static int getProximoId() {
        return proximoId;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario;
    }
}
