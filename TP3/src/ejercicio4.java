import java.util.Stack;

public class ejercicio4 {
    public static void main(String[] args) {


        String texto  = ")(123)(";
        if(validarParentesis(texto)) {
            System.out.println("Esta balanceada los parentesis");
        }
        else {
            System.out.println("No esta balanceada los parentesis");
        }

    }

    public static boolean validarParentesis(String texto) {
        Stack<Character> pila = new Stack<Character>();

        for (int i = 0; i < texto.length(); i++) {
            Character c = texto.charAt(i);
            if(c == '('){
                pila.push(c);
            }

            if(c == ')'){
                if(pila.isEmpty()){
                    return false;
                }
                pila.pop();
            }
        }
        return pila.isEmpty();
    }
}
