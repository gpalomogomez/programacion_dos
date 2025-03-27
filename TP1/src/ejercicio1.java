import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        boolean salir = true;
        int opcion;

        System.out.println("Ingrese 2 numeros");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int numero = input.nextInt();
        int numero2 = input2.nextInt();

        while (salir) {
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    sumar(numero,numero2);
                    break;
                case 2:
                    restar(numero,numero2);
                    break;
                case 3 :
                    multiplicar(numero,numero2);
                    break;
                case 4 :
                    dividir(numero,numero2);
                    break;
                case 5 :
                    salir = false;
                    break;
                default:
                    System.out.println("error");
            }
        }
    }

    static void sumar(Integer input, Integer input2) {
        System.out.println("La suma de los 2 numeros es: " + (input + input2));
    }

    static void restar(Integer input, Integer input2) {
        System.out.println("La resta de los 2 numeros es: " + (input - input2));
    }

    static void multiplicar(Integer input, Integer input2) {
        System.out.println("La multiplicacion de los 2 numeros es: " + (input * input2));
    }

    static void dividir(Integer input, Integer input2) {
        if (input2 >= 0)
            System.out.println("La division de los 2 numeros es: " + (input / input2));
        else
            System.out.println("Error, no se puede dividir por cero");
    }
}
