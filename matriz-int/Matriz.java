
public class Matriz
{
    //     private int matriz[][];
    private int matriz[][];

    public Matriz() {
        this.matriz = new int[][] {{1, 0, 2},
                                   {1, 2, 5},
                                   {2, 0, 0} };
    }

    public Matriz(int matriz[][]) {
        this.matriz = matriz;
    }

    public boolean isMatrizQuadrada() {        
        boolean matrizQuadrada = true;
        for (int linha = 0; linha < this.matriz.length; linha++) {
            if (this.matriz.length != this.matriz[linha].length) {
                matrizQuadrada = false;
            }
        }
        return matrizQuadrada;
    }

    public String mostraMatriz() {
        String matrizFinal = "";
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                matrizFinal += matriz[linha][coluna] + "  ";
            } 
            matrizFinal += "\n";
        }
        return matrizFinal;
    }

    public void atualizaMatriz(int linha, int coluna, int novoValor) {
        try {
            matriz[linha][coluna] = novoValor;
        } catch (Exception e){
            System.out.println("Não foi possível atualizar o valor.");
        }
    }

    public int somaDiagonalPrincipal() {
        int somadiagonal = 0;
        if(isMatrizQuadrada()) {
            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz.length; coluna++) {
                    if (linha == coluna) {
                        somadiagonal += matriz[linha][coluna];
                    }
                } 
            }
        } else {
            somadiagonal = -1;
        }
        return somadiagonal;
    }
    
    public int somaDiagonalSecundaria() {
        int somadiagonal = 0;
        if(isMatrizQuadrada()) {
            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz.length; coluna++) {
                    if (linha + coluna == matriz.length - 1) {
                        somadiagonal += matriz[linha][coluna];
                    }
                } 
            }
        } else {
            somadiagonal = -1;
        }
        return somadiagonal;
    }
    
    public int somaLinha(int lin) {
        int somalinha = 0;
        for (int c = 0; c < matriz[lin].length; c++) {
            somalinha += matriz[lin][c];
        }
        return somalinha;
    }
    
    public int somaColuna(int col) {
        int somalinha = 0;
        for (int l = 0; l < matriz[col].length; l++) {
            somalinha += matriz[l][col];
        }
        return somalinha;
    }
}
