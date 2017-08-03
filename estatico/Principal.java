import java.util.Scanner;

public class Principal
{
    public static void main(String args[]) {
        Controle controle = new Controle();
        Scanner input = new Scanner(System.in);
        int op = 0;
        String nome;
        double salario;
        while(op != 9) {
            showMenu();
            op = input.nextInt();
            switch(op) {
                case 1:
                    System.out.print("Nome: ");
                    nome = input.next();
                    System.out.print("Salario: ");
                    salario = input.nextDouble();
                    controle.cadastraEmpregado(nome, salario);
                    break;
                case 2:
                    System.out.print(controle.listaEmpregado());
                    break;
                case 3:
                    System.out.print("Departamento: ");
                    nome = input.next();
                    controle.cadastraDepartamento(nome);
                    break;
                case 9:
                    System.out.print("Finalizando .  .  .  .  .  . ");
                    break;
            }
        }
    }
    
    public static void showMenu() {
        String menu = "\nMenu ------------------------------ \n" +
                      "1 - Cadastrar Empregado \n" +
                      "2 - Listar todos Empregados \n" +
                      "3 - Cadastrar Departamento \n" +
                      "4 - Adicionar Empregado ao Departamento \n" +
                      "5 - Remover Empregado Empregado ao Departamento \n" + 
                      "6 - Listar Empregados por Departamento \n" +
                      "9 - Fim \n" + 
                      "----------------------------------- \n" + 
                      "> ";
        System.out.print(menu);
    }
}
