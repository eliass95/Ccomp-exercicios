
public class Operacao
{
    public int soma(int n1, int n2) {
        return n1 + n2;
    }
    
    public int soma(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    
    public int soma(int[] num) {
        int somaFinal = 0;
        for (int i: num) {
            somaFinal += i;
        }
        return somaFinal;
    }
    
    public int maiorNumero(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
    
    public int maiorNumero(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }
}
