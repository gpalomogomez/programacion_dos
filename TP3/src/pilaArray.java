public class pilaArray {

        private int[] pila;
        private int tope;
        private int capacidad;

        public pilaArray(int tamano) {
            capacidad = tamano;
            pila = new int[capacidad];
            tope = -1;
        }

        public void push(int dato) {
            if (tope == capacidad - 1) {
                System.out.println("Desbordamiento de pila");
                return;
            }
            pila[++tope] = dato;
        }

        public int pop() {
            if (tope == -1) {
                System.out.println("Pila vacía");
                return -1;
            }
            return pila[tope--];
        }

        public int peek() {
            if (tope == -1) {
                System.out.println("Pila vacía");
                return -1;
            }
            return pila[tope];
        }

        public boolean isEmpty() {
            return tope == -1;
        }

        public int size() {
            return tope +1 ;
        }

        public void clear() {
            tope = -1;
            System.out.println("Pila vaciada");
        }

        public boolean isFull() {
            return tope == capacidad;
        }

        public void print() {
            if (tope == -1) {
                System.out.println("La pila está vacía");
                return;
            }
            System.out.println("Elementos en la pila (de arriba hacia abajo):");
            for (int i = tope; i >= 0; i--) {
                System.out.println(pila[i]);
            }
        }

        public int pop_corrido() {

            if (tope == -1) {
                System.out.println("Pila vacía");
                return -1;
            }
            int valorElimando = pila[0];
            for (int i = 0; i < tope; i++) {
                pila[i] = pila[i+1];
            }
            tope--;
            return valorElimando;
        }

        public void push_corrido(int dato) {
            if (tope == capacidad - 1) {
                System.out.println("Desbordamiento de pila");
                return;
            }
            for (int i = tope; i >= 0; i--) {
                pila[i+1] = pila[i];
            }

            pila[0] = dato;
            tope++;
        }


}
