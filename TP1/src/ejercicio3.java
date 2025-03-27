import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese 1 numero");
        int numero = consola.nextInt();

        for(int i=1; i<11; i++) {
            System.out.println("Tabla: "+ i + "*" + numero +" = " + i * numero);
        }
    }
}
