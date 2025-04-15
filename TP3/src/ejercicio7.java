import java.util.Stack;

public class ejercicio7 {
    public static void main(String[] args) {

        editorTexto texto = new editorTexto();

        texto.ingresarTexto("Matias");
        texto.ingresarTexto("y");
        texto.ingresarTexto("Ger");
        System.out.println("deshaciendo texto");
        texto.print();
        texto.deshacerTexto();

        texto.print();
        texto.rehacerTexto();
        System.out.println("rehaciendo texto");
        texto.print();

    }
}




