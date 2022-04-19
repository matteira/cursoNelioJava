package primitive;

import java.util.Scanner;

public class basico {
    public static void main(String[] args) {

        //System.out.println("Hello World");

        /*Scanner leitor = new Scanner(System.in);

        int inicio = leitor.nextInt();
        int meio = leitor.nextInt();
        int f = inicio - meio;
        int laco = 10;

        for (int i = 0; i < laco; i++) {
            System.out.println("===================");
            System.out.println("Valor do inicio: " + inicio);
            System.out.println("Valor do meio: "+ meio);
            System.out.println("Seu resultado final: " + f);
        }

        leitor.close();*/

        /*Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int y = leitor.nextInt();
        double result = (int) x - y;

        if (x < y){
            System.out.println("N foi possivel gerar o resultado! ");
        }else if (x > y){
            System.out.println("Resultado final do calculo: " + result);
        }

        leitor.close();*/

        /*Scanner leitor = new Scanner(System.in);

        int minutos = leitor.nextInt();

        double conta = 50.00;

        if (minutos > 100){
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta: %.2f%n", conta);*/

        Scanner leitor = new Scanner(System.in);


        System.out.println("Que horas são? ");
        System.out.println("=============");
        System.out.print("São: ");
        int hora = leitor.nextInt();
        String mensagem;


        switch (hora){
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mensagem = "Bom dia";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagem = "Boa tarde";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
                mensagem = "Boa noite";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                mensagem = "Vai dormir chupeta";
                break;
            default:
                mensagem = "Essa hora não existe!";
                break;
        }
        System.out.println(mensagem);

        
    }
}
