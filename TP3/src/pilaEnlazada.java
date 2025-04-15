class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class PilaEnlazada {
    private Nodo tope;

    public void push(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
    }

    public int pop() {
        if (tope == null) {
            System.out.println("Pila vacía");
            return -1;
        }
        int dato = tope.dato;
        tope = tope.siguiente;
        return dato;
    }

    public int peek() {
        if (tope == null) {
            System.out.println("Pila vacía");
            return -1;
        }
        return tope.dato;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void print() {
        Nodo nodo = tope;
        if (isEmpty()) {
            System.out.println("Pila esta vacia");
        }

        while (nodo != null) {
            System.out.println(nodo.dato);
            nodo = nodo.siguiente;
        }
    }
}
