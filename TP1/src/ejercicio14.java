import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = 0;
        int sumaNotas = 0;
        int cantidadNotas = 0;

        while(true) {
            System.out.println("Ingrese una nota (-1 para finalizar) :");
            nota = input.nextInt();
            if(nota == -1) {
                break;
            }
            sumaNotas += nota;
            cantidadNotas++;
        }
        if(cantidadNotas == 0) {
            System.out.println("Cantidad de notas invalidas");
        }
        else {
            double promedio = (sumaNotas / cantidadNotas);
            System.out.println("El promedio es: " + promedio);

            if (promedio >= 6)
                System.out.println("Aprobado");
            else
                System.out.println("Desaprobado");
        }
    }
}
