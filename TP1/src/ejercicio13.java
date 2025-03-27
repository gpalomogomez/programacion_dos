import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero = sc.nextInt();
        String numeroString = Integer.toString(numero);
        String numeroInvertido = "";

        for (int i = numeroString.length()-1; i>=0; i--) {
            numeroInvertido += numeroString.charAt(i);
        }

        if(numeroInvertido.equals(numeroString)){
            System.out.println("Es capicúa");
        }
        else{
            System.out.println("No es capicúa");
        }

    }
}
