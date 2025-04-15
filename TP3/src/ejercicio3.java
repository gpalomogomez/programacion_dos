public class ejercicio3 {
    public static void main(String[] args) {

        PilaEnlazada pila = new PilaEnlazada();

        if(pila.isEmpty()) {
            System.out.println("La pila esta vacia");
        }
        pila.push(60);
        pila.push(70);
        pila.push(80);
        pila.push(90);

        pila.print();

        int popValor = pila.pop();
        System.out.println("Valor eliminado: " + popValor);

        pila.print();

        if(!pila.isEmpty()) {
            System.out.println("La pila no esta vacia");
        }
    }
}
