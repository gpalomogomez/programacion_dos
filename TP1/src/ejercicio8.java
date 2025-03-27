import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        boolean salir = true;
        Double saldo = 0.0;
        int opcion;
        Scanner input = new Scanner(System.in);
        while (salir) {
            System.out.println("1- Consultar");
            System.out.println("2- Depositar");
            System.out.println("3- Retirar");
            System.out.println("4- Salir");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo(saldo);
                    break;
                case 2:
                    saldo = setSaldo(saldo,input);
                    break;
                case 3 :
                    saldo = removeSaldo(saldo,input);
                    break;
                case 4 :
                    salir = false;
                    break;
                default:
                    System.out.println("error");
            }
        }
    }

    static void consultarSaldo(Double saldo) {
        System.out.println("Su saldo es " + saldo);
    }

    static double setSaldo(Double saldo,Scanner input) {
        return input.nextDouble() + saldo;
    }

    static double removeSaldo(Double saldo,Scanner input) {
        return saldo - input.nextDouble();
    }


}