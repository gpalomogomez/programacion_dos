
public class ejercicio1 {
    public static void main(String[] args) {
        pilaArray pila = new pilaArray(5);

        pila.push(5);
        pila.push(6);
        pila.push(10);
        pila.push(62);
        pila.push(70);

        pila.print();
        System.out.println("Tamaño de la pila");
        System.out.println(pila.size());
        pila.clear();
        pila.print();

    }
}
