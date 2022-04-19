package treino_matriz;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int [][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }

        System.out.println("Valor final: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println(" ");

        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0){
                    count++;
                }
            }
        }

        int count1 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0){
                    count1++;
                }
            }
        }

        System.out.println("Quantos numeros negativos: " + count);
        System.out.println("Quantos numeros positivos: " + count1);

        leitor.close();
    }
}
