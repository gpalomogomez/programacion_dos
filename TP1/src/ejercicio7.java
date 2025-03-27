import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scaner = new Scanner(System.in);
        int numero ;
        int numeroRandom = random.nextInt(100);
        boolean termino = false;
        while (!termino) {
            System.out.println("Ingrese un número");
            numero = scaner.nextInt();

            if (numero == numeroRandom) {
                System.out.println("Adivinaste el número secreto es " + numero);
                termino = true;
            }

            if (numero<numeroRandom) {
                System.out.println("El numero ingresado es menor al número secreto");
            }
            else if (numero>numeroRandom) {
                System.out.println("El número ingresado es mayor al numero secreto");
            }
        }

    }
}
