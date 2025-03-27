import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumPar = 0;
        int sumImpar = 0;
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero: ");
            int numero = sc.nextInt();

            if(numero%2 == 0){
                sumPar += numero;
            }
            else{
                sumImpar += numero;
            }
        }

        System.out.println("La suma de los numeros pares es: " + sumPar);
        System.out.println("La suma de los numeros impares es: " + sumImpar);
    }
}
