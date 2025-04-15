public class ejercicio2 {
    public static void main(String[] args) {
        pilaArray pila = new pilaArray(10);

        pila.push(5);
        pila.push(6);
        pila.push(10);
        pila.push(70);

        pila.print();
        System.out.println("Tamaño de la pila");
        System.out.println(pila.size());

        pila.push_corrido(30);
        pila.push_corrido(75);
        pila.print();
        int valorEliminado =pila.pop_corrido();
        System.out.println("Valor eliminado del primer elemento: " + valorEliminado);
        pila.print();
    }
}
