import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        cantidadLibrosFija();
        cantidadLibrosVariable();
    }

    public static void cantidadLibrosFija() {
        Scanner sc = new Scanner(System.in);
        String libros[] = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el libro " + (i+1) + ":");
            libros[i] = sc.nextLine();
        }

        System.out.println("Ingrese el nombre del titulo o parte del nombre a buscar: ");
        String busqueda = sc.nextLine().toLowerCase();
        boolean existe = false;

        for (int i = 0; i < 10; i++) {
            if (libros[i].toLowerCase().contains(busqueda)) {
                System.out.println("El nombre del titulo es " + libros[i] + " y esta en la posicion " + i );
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("El libro no existe");
        }
    }

    public static void cantidadLibrosVariable() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> libros = new ArrayList<>();
        boolean flag = true;
        do {
            System.out.println("Coloque el nombre del nuevo libro a ingresar, para salir escriba -1" );
            String libro = sc.nextLine();
            if (libro.contains("-1"))
                flag = false;
            else
                libros.add(libro);

        } while (flag);

        System.out.println("Ingrese el nombre del titulo o parte del nombre a buscar: ");
        String busqueda = sc.nextLine().toLowerCase();
        boolean existe = false;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).toLowerCase().contains(busqueda)) {
                System.out.println("El nombre del titulo es " + libros.get(i) + " y esta en la posicion " + i );
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("El libro no existe");
        }

    }
}
