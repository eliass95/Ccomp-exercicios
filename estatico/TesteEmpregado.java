import java.util.ArrayList;
import java.util.Scanner;

public class TesteEmpregado
{
    public static void main(String args[]) {
        ArrayList<Empregado> emp = new ArrayList<Empregado>();

        Scanner teclado = new Scanner(System.in);

        double salario;
        String nome;
        Empregado empAux;
        int op = 0;

        while (op != 9) {
            showMenu();
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    nome = teclado.next();
    
                    System.out.print("Salario: ");
                    salario = teclado.nextDouble();
    
                    empAux = new Empregado(nome,salario);
                    emp.add(empAux);
                    break;
                case 2:
                    for (int i=0; i<emp.size(); i++) {
                        empAux = emp.get(i);
                        System.out.println("Matricula: " + empAux.getId());
                        System.out.println("Nome: " + empAux.getNome());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Proximo ID: " + Empregado.getProximoId());
                    break;
                case 9:
                    System.out.println("Programa encerrado . . . ");
                    break;
            }
        }
    }
    
    public static void showMenu(){
        System.out.println("\n\n\nMENU ------------");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar");
        System.out.println("3. Proximo Id");
        System.out.print("9. Encerrar \n> ");
    }
}
