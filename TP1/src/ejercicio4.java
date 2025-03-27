import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        int contador = 0;
        int resto = 0;
        double resultado;
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        do{
            numero = numero/10;
            contador++;

        }
        while(numero>0);
        System.out.println(contador);
    }
}
