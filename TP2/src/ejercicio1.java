import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mayorPromedio = 0;
        int alumnoMayorPromedio = -1;

        int[][] notas = new int[5][4];
        float[] promedio = new float[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Ingresar notas del estudiante " + (i+1) + ":");
            int sumatoria = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("  Nota de la materia " + (j+1) + ": ");
                notas[i][j] = sc.nextInt();
                sumatoria += notas[i][j];
            }
            promedio[i] = (float) sumatoria / 4;

            if (promedio[i] > mayorPromedio) {
                mayorPromedio = promedio[i];
                alumnoMayorPromedio = i;
            }
        }

        System.out.println("El estudiante con el mayor promedio es el estudiante " + (alumnoMayorPromedio + 1) +
                " con un promedio de " + mayorPromedio);
    }
}
