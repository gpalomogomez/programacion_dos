import java.util.Objects;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_intentos = 3;
        int intentos = 0;
        boolean concedido = false;
        String contraseña = "uade123";
        String contraseña_input;


        while (intentos < max_intentos) {
            System.out.println("Ingrese su contraseña: ");
             contraseña_input= scanner.nextLine();
            if (!contraseña.equals(contraseña_input))
            {
                System.out.println("Error al ingresar la contraseña");
                intentos++;
            }
            else
            {
                System.out.println("acceso concedido");
                intentos = 4;
                concedido = true;
            }
        }

        if(!concedido){
            System.out.println("Alcanzaste limite reintentos");
        }


    }
}
