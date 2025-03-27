import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        boolean esPrimo = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();

        for(int i = 2; i<numero-1;i++){
            if(numero%i==0){
                esPrimo = false;
                break;
            }
        }

        System.out.println("El número: "+ numero +" " + ((esPrimo) ? "Es primo" : "No es primo"));
    }
}
