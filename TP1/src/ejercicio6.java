import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce una calificación  del 1 y 10: ");
        int nota = input.nextInt();

        if (nota < 1 || nota > 10) {
            System.out.println("El numero introducido no es valido");
        }else{
            if (nota >= 1 && nota <= 3) {
                System.out.println("Insuficiente");
            }else if (nota >= 4 && nota <= 5) {
                System.out.println("Regular");
            }else if (nota >= 6 && nota <= 7) {
                System.out.println("Bueno");
            } else if (nota >= 8 && nota <= 9) {
                System.out.println("Muy Bueno");
            }else if (nota == 10) {
                System.out.println("Excelente");
            }
        }
    }
}
