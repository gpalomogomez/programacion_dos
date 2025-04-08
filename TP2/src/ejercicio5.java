import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1,10);
        int[][] A = aleatorioInt(n);
        int[][] B = aleatorioInt(n);
        int[][] resultadoSuma = sumarMatriz(A,B,"sumar");
        int[][] resultadoResta = sumarMatriz(A,B,"restar");

        imprimirMatriz(A);
        System.out.println("Separando");
        imprimirMatriz(B);
        System.out.println("Resultado Suma: ");
        imprimirMatriz(resultadoSuma);
        System.out.println("Resultado Resta: ");
        imprimirMatriz(resultadoResta);

    }


    public static int[][] aleatorioInt(int n) {
        Random random = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(15);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%3d ", valor);
            }
            System.out.println();
        }
    }

    public static int[][] sumarMatriz(int[][] A, int[][] B,String operacion) {
        int[][] resultado = new int[A.length][A.length];
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++) {
                if("restar".equals(operacion)) {
                    resultado[i][j] = A[i][j] - B[i][j];
                }
                else {
                    resultado[i][j] = A[i][j] + B[i][j];
                }
            }
        }
        return resultado;
    }
}
