public class Empregado
{
    private int id;
    private String nome;
    private double salario;
    private static int proximoId;
    
    public Empregado(String nome, double salario)
    {
        this.nome = nome;
        this.salario = salario;
        this.id = proximoId;
        proximoId++;
    }
}
