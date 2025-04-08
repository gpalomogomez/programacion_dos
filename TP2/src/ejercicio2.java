import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos: ");
        int n = sc.nextInt();
        System.out.println("Ingrese la cantidad de depósitos: ");
        int m = sc.nextInt();

        int[][] stock = cargarStock(m, n);

        mostrarStockTotalxProducto(stock, m, n);

        depositoConMayorCantAcumulada(stock, m);

    }

    public static int[][] cargarStock(int m, int n) {
        Scanner sc = new Scanner(System.in);
        int[][] stock = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("Ingrese cantidad de productos en el deposito " + (i + 1) + " : ");
            for (int j = 0; j < n; j++) {
                System.out.println("Cantidad de producto " + (j + 1) + ": ");
                stock[i][j] = sc.nextInt();
            }
        }
        return stock;
    }

    public static void mostrarStockTotalxProducto(int[][] stock, int m, int n) {
        System.out.println("Stock total x Producto: ");
        for (int i = 0; i < n; i++) {
            int productoTotal = 0;
            for (int j = 0; j < m; j++) {
                productoTotal += stock[j][i];
            }
            System.out.println("Producto " + (i + 1) + ": " +productoTotal);
        }
    }

    public static void depositoConMayorCantAcumulada(int[][] stock, int m) {
        int stockMaximo = 0;
        int depositoMaxStock =-1;
        for (int i = 0; i < m; i++) {
            int totalDepo = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalDepo += stock[i][j];
            }
            if (totalDepo > depositoMaxStock) {
                stockMaximo = totalDepo;
                depositoMaxStock = i;
            }
        }
        System.out.println("El deposito con mayor cantidad acumulada es el deposito " + (depositoMaxStock+1) + " con " + stockMaximo + " productos.");
    }
}
