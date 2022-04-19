package vector;

import java.util.Scanner;

public class treinoVec {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        double[] vec = new double[n];

        for (int i = 0; i < n; i++) {
            vec[i] = leitor.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vec[i];
        }

        double estima = sum / n;

        System.out.println("Calculo estimado: " + estima);

        leitor.close();
    }
}
