import java.util.Scanner;

public class Principal
{
    public static void main(String args[]) {
        Controle controle = new Controle();
        Scanner input = new Scanner(System.in);
        int op = 0;
        String nome;
        double salario;
        int matricula;
        
        while(op != 11) {
            showMenu();
            op = input.nextInt();
            System.out.println("\n\n\n\n");
            switch(op) {
                case 1: // Cadastra Empregado
                    System.out.print("CADASTRAR EMPREGADO> \nNome: ");
                    nome = input.next();
                    System.out.print("Salario: ");
                    salario = input.nextDouble();
                    controle.cadastraEmpregado(nome, salario);
                    break;
                    
                case 2: // Lista todos os Empregados
                    System.out.print("EMPREGADOS> \n" + controle.listaEmpregado());
                    break;

                case 3: // Cadastra Departamento
                    System.out.print("CADASTRAR DEPARTAMENTO> \nDepartamento: ");
                    nome = input.next();
                    controle.cadastraDepartamento(nome);
                    break;

                case 4: // Adiciona Empregado ao Departamento
                    System.out.println("ADICIONAR EMPREGADO AO DEPARTAMENTO>");
                    System.out.print("Matricula do empregado: ");
                    matricula = input.nextInt();
                    System.out.print("Departamento: ");
                    nome = input.next();
                    controle.adicionaEmpDep(nome, matricula);
                    break;

                case 5: // Remove Empregado do Departamento
                    System.out.println("REMOVER EMPREGADO DO DEPARTAMENTO>");
                    System.out.print("Matricula do empregado: ");
                    matricula = input.nextInt();
                    System.out.print("Departamento: ");
                    nome = input.next();
                    controle.removeEmpDep(nome, matricula);
                    break;

                case 6: // Lista Empregados de um Departamento
                    System.out.print("LISTAR EMPREGADOS> \nDepartamento: ");
                    nome = input.next();
                    System.out.println(controle.listaEmpDep(nome));
                    break;

                case 7: // Listar todos os Departamentos
                    System.out.println("DEPARTAMENTOS>");
                    System.out.println(controle.listarDepartamentos());
                    break;

                case 8: // Excluir Departamento
                    System.out.print("EXCLUIR DEPARTAMENTO> \nDepartamento: ");
                    nome = input.next();
                    controle.excluirDepartamento(nome);
                    break;
                
                case 9: // Alterar Salário
                    System.out.println("ALTERAR SALARIO>");
                    System.out.print("Matricula do empregado: ");
                    matricula = input.nextInt();
                    System.out.print("Salario: ");
                    salario = input.nextDouble();
                    controle.alterarSalarioEmpregado(matricula, salario);
                    break;

                case 11: // Encerrar programa
                    System.out.print("Finalizando .  .  .  .  .  . ");
                    input.close();
                    break;
            }
        }
    }
    
    public static void showMenu() {
        String menu = "\n\n\n\n\n\n\n\n\n\nMenu ------------------------------ \n" +
                      "1 - Cadastrar Empregado \n" +
                      "2 - Listar todos Empregados \n" +
                      "3 - Cadastrar Departamento \n" +
                      "4 - Adicionar Empregado ao Departamento \n" +
                      "5 - Remover Empregado Empregado do Departamento \n" + 
                      "6 - Listar Empregados por Departamento \n" +
                      "7 - Listar Departamentos \n" +
                      "8 - Remover Departamento \n" + 
                      "9 - Alterar Salario \n" +
                      "11 - Encerrar \n" + 
                      "----------------------------------- \n" + 
                      "> ";
        System.out.print(menu);
    }
}
