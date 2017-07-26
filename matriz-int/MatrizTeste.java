import java.util.Scanner;

public class MatrizTeste
{
    public static void main(String args[]) {
        Matriz matriz = new Matriz();
        System.out.println(matriz.mostraMatriz());
        
//         Scanner t = new Scanner(System.in);
//         System.out.println("Atualizar valor da Matriz");
//         System.out.print("Insira a linha: ");
//         int linha = t.nextInt();
//         System.out.print("Insira a coluna: ");
//         int coluna = t.nextInt();
//         System.out.print("Insira o valor: ");
//         int valor = t.nextInt();
//         
//         matriz.atualizaMatriz(linha, coluna, valor);
//         System.out.println(matriz.mostraMatriz());
        
        System.out.println(matriz.mostraTransposta());
    }
}
