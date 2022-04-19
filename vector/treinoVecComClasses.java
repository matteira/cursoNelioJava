package vector;

import java.util.Scanner;

public class treinoVecComClasses {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        Produto[] vec = new Produto[n];

        for (int i = 0; i < vec.length; i++) {
            leitor.nextLine();
            vec[i] = new Produto(leitor.nextLine(), leitor.nextDouble());
        }

        double sum = 0.0;
        for (int i = 0; i < vec.length; i++) {
            sum += vec[i].getPreco();
        }

        double cal = sum / vec.length;

        System.out.printf("Calculo dos precos: %.2f%n", cal);
        leitor.close();
    }
}
