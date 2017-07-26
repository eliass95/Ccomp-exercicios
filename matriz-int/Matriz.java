public class Matriz
{
    private int matriz[][];

    public Matriz() {
        this.matriz = new int[][] {{1, 2, 3},
                                   {4, 5, 6},
                                {7, 8, 9}};
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
            System.out.println("Nao foi possivel atualizar o valor.");
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

    public int[][] transposta() {
        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                matrizTransposta[linha][coluna] = this.matriz[coluna][linha];
            } 
        }
        return matrizTransposta;
    }
    
    public String mostraTransposta() {
        int[][] transposta = transposta();
        String matrizFinal = "";
        for (int linha = 0; linha < transposta.length; linha++) {
            for (int coluna = 0; coluna < transposta[linha].length; coluna++) {
                matrizFinal += transposta[linha][coluna] + "  ";
            } 
            matrizFinal += "\n";
        }
        return matrizFinal;
    }
    
    public boolean isQuadradoMagico() {
        if(isMatrizQuadrada()){
            System.out.println("Quadrada");
            int soma[] = new int[matriz.length * 2 + 2];
            
            for (int i=0; i<matriz.length; i++) {
                soma[i] = somaLinha(i);
                soma[i + matriz.length] = somaColuna(i);
            }
            
            soma[soma.length-2] = somaDiagonalPrincipal();
            soma[soma.length-1] = somaDiagonalSecundaria();
            
            boolean m = true;
            
            for(int i=0; i<soma.length; i++) {
                if(soma[i] != soma[0]) {
                    m=false;
                    break;
                }
            }
            
            return m;
        } else {
            return false;
        }
    }
}
