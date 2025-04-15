import java.util.Scanner;
import java.util.Stack;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto  = "";

        System.out.println("Ingrese una palabra");
        texto = scanner.nextLine();

        System.out.println("Palabara invertida "+ palabraInvertida(texto));

    }

    public static String palabraInvertida(String texto) {
        Stack<Character> pila = new Stack<Character>();
        StringBuilder palabra = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            Character c = texto.charAt(i);
            pila.push(c);
        }
        while (!pila.isEmpty()) {
            palabra.append(pila.pop());
        }

        return palabra.toString();
    }
}
