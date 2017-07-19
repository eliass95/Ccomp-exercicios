
public class Matriz
{
    //     private int matriz[][];
    private int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

    public Matriz(int matriz[][]) {
        this.matriz = matriz;
    }

    public static boolean isMatrizQuadrada(int matriz[][]) {        
        boolean matrizQuadrada = true;
        for (int linha = 0; linha < matriz.length; linha++) {
            if (matriz.length != matriz[linha].length) {
                matrizQuadrada = false;
            }
        }
        return matrizQuadrada;
    }

    public static String mostraMatriz(int matriz[][]) {
        String matrizFinal = "";

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                matrizFinal += matriz[linha][coluna] + "  ";
            } 
            matrizFinal += "\n";
        }

        return matrizFinal;
    }
}
