import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) {

        int semanas = 4;
        int dias = 7;
        double[][] temperaturas = new double[4][7];
        Random random = new Random();

        double[] temperaturaMediaSemanal = new double[semanas];
        double temperaturaMediaMensual = 0;

        double maxTemp = Double.MIN_VALUE;
        double minTemp = Double.MAX_VALUE;
        int semanaMax = 0;
        int diaMax = 0;
        int semanaMin = 0;
        int diaMin = 0;

        for (int i = 0; i < semanas; i++) {
            for (int j = 0; j < dias; j++) {
                temperaturas[i][j] = random.nextDouble(100);
                temperaturaMediaSemanal[i] += temperaturas[i][j];
                temperaturaMediaMensual += temperaturas[i][j];

               if (temperaturas[i][j] > maxTemp) {
                    maxTemp = temperaturas[i][j];
                    semanaMax = i;
                    diaMax = j;
                }

                if (temperaturas[i][j] < minTemp) {
                    minTemp = temperaturas[i][j];
                    semanaMin = i;
                    diaMin = j;
                }
            }
        }

        for (int i = 0; i < semanas; i++) {
            System.out.println("Temperatura media semana "+(i+1)+" : " + Math.round(temperaturaMediaSemanal[i]/dias));
        }

        System.out.println("Temperatura media mensual : "  + Math.round(temperaturaMediaMensual/(semanas*dias)));

        System.out.println("Fecha mas caluroso : semana "+(semanaMax+1)+" día "+(diaMax+1) + " con " + maxTemp + " grados");

        System.out.println("Fecha más frio : semana "+(semanaMin+1)+" día "+(diaMin+1) + " con " + minTemp + " grados");

    }


}
