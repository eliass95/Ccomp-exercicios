import java.util.ArrayList;

public class Controle
{
    private ArrayList<Empregado> listEmp;
    private ArrayList<Departamento> listDep;
    
    /**
     * Instanciar ArrayList
     */
    public Controle()
    {
        listEmp = new ArrayList<Empregado>();
        listDep = new ArrayList<Departamento>();
    }
    
    /**
     * Cria objeto empregado
     * Insere empregado na lista de empregados 
     */
    public void cadastraEmpregado(String nome, double salario) {
        Empregado novoEmpregado = new Empregado(nome, salario);
        this.listEmp.add(novoEmpregado);
    }
    
    /**
     * Cria objeto departamento
     * Insere departamento na lista de departamentos
     */
    public void cadastraDepartamento(String nome) {
        Departamento novoDepartamento = new Departamento(nome);
    }
    
    /**
     * Retorna matricula, nome e salário de todos os empregados cadastrados.
     */
    public String listaEmpregado() {
        String lista = "";
        Empregado empregado;
        for(int i=0; i<this.listEmp.size(); i++) {
            empregado = listEmp.get(i);
            lista += empregado.getId() + " " 
                    + empregado.getNome() + " " 
                    + empregado.getSalario() + "\n";
        }        
        return lista;
    }
}



