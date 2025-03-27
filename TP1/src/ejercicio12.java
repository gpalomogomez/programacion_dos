import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {

        System.out.println("Ingrese una palabra:");
        Scanner input = new Scanner(System.in);

        String palabra = input.nextLine().toLowerCase().trim();
        
        int cantVocales = 0;
        int cantConsonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o') {
                cantVocales++;
            } else
                cantConsonantes++;
        }

        System.out.println("Vocales: " + cantVocales);
        System.out.println("Consonantes: " + cantConsonantes);
    }
}
