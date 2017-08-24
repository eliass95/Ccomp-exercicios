import java.util.ArrayList;

public class Departamento
{
    private String nome;
    private ArrayList<Empregado> listEmp;

    public Departamento(String nome)
    {
        this.nome = nome;
        listEmp = new ArrayList<Empregado>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addEmpregado(Empregado emp) {
        this.listEmp.add(emp);
    }

    public void removeEmpregado(Empregado emp) {
        this.listEmp.remove(emp);
    }

    public String listarEmpregado() {
        String lista = "";
        for (Empregado empregado: this.listEmp) {
            lista += (empregado.getId() + " - " + empregado.getNome() + "\n");
        }
        return lista;
    }
    
    public int getNumFuncionarios() {
        return listEmp.size();
    }
}