import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo:");
        int numero = scanner.nextInt();
        int factorial = 1;

        if (numero<0) {
            System.out.println("Error al ingresar el numero, debe ser positivo");
        }
        else{
            for (int i = 1 ; i <= numero ; i++) {
                factorial = factorial * i;
            }
            System.out.println("El numero: "+numero + "! = " + factorial);
        }
    }
}
