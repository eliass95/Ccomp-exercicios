import java.util.ArrayList;

public class Controle
{
    private ArrayList<Empregado> listEmp;
    private ArrayList<Departamento> listDep;

    /**
     * Instanciar ArrayList de Empregados e Departamentos
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
        this.listDep.add(novoDepartamento);
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

    /**
     * Localiza departamento e funcionario.
     * Adiciona empregado ao departamento.
     */
    public void adicionaEmpDep (String nomeDep, int idEmpregado) {
        for(Departamento dep: listDep) {
            if (dep.getNome().equals(nomeDep)) {  
                for(Empregado emp : listEmp) {
                    if (emp.getId() == idEmpregado) {
                        
                        if (emp.getAlocadoDepartamento()) {
                            System.out.println("Não é possivel adicionar empregado já existente.");
                            break;
                        } else {
                            dep.addEmpregado(emp);
                            emp.setAlocadoDepartamento(true);
                            System.out.println(
                                String.format("Empregado %s adicionado com sucesso ao departamento %s", 
                                    emp.getNome(), dep.getNome()));
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * Localiza departamento e funcionario.
     * Remove empregado do departamento.
     */
    public void removeEmpDep (String nomeDep, int idEmpregado) {
        for(Departamento dep: listDep) {
            if (dep.getNome().equals(nomeDep)) {  
                for(Empregado emp : listEmp) {
                    if(emp.getId() == idEmpregado) {
                        dep.removeEmpregado(emp);
                        emp.setAlocadoDepartamento(false);
                        System.out.println(
                            String.format("Empregado %s removido com sucesso ao departamento %s", 
                                emp.getNome(), dep.getNome()));
                        break;
                    }
                }
            }
        }
    }
    
    /**
     * Remove empregado dos departamentos.
     */
    public void removeEmpDep (Empregado empregado) {
        for(Departamento dep: listDep) {
            if(dep.existeEmpregado(empregado.getId())) {
                dep.removeEmpregado(empregado);
            }
        }
    }

    /**
     *  Lista os funcionários de um departamento.
     */
    public String listaEmpDep (String nomeDep) {        
        String listaFuncionarios = "";
        for(Departamento dep: listDep) {
            if (dep.getNome().equals(nomeDep)) {  
                listaFuncionarios += "Funcionarios: " + dep.getNome() + " ---------------------------\n";
                listaFuncionarios += dep.listarEmpregado();
                break;
            }
        }
        return listaFuncionarios;
    }

    /**
     *  Lista todos os departamentos cadastrados.
     */
    public String listarDepartamentos() {
        String listaString = "";
        for(Departamento dep: listDep) {
            listaString += dep.getNome() + "\n";
        }
        return listaString;
    }

    public void excluirDepartamento(String nomeDep) {
        for(int i = 0; i < listDep.size(); i++) {
            Departamento dep = listDep.get(i);
            if (dep.getNome().equals(nomeDep)) {
                if(dep.getNumFuncionarios() == 0) {
                    listDep.remove(dep);
                    System.out.println("Departamento " + dep.getNome() + " removido com sucesso.");
                    break;
                } else {
                    System.out.println("Não foi possível excluir departamento pois ele possui funcionários.");
                    break;
                }
            }          
        }
    }

    public void alterarSalarioEmpregado(int idEmpregado, double novoSalario) {
        for (int i=0; i<listEmp.size(); i++) {
            Empregado emp = listEmp.get(i);
            if(emp.getId() == idEmpregado) {
                emp.setSalario(novoSalario);
                System.out.printf("O salario de %s foi alterado com sucesso para R$ %s", 
                    emp.getNome(), novoSalario);
            }
        }
    }
    
    public void excluirEmpregado(int idEmpregado) {
        for (int i=0; i<listEmp.size(); i++) {
            Empregado emp = listEmp.get(i);
            if(emp.getId() == idEmpregado) {
                listEmp.remove(emp);
                removeEmpDep(emp);
                System.out.printf("O empregado %s foi removido com sucesso", emp.getNome());
            }
        }
    }
}
