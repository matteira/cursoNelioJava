package getAndSetWhitConstrutor;

import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Estoque produto = new Estoque("", 0 ,0);

        System.out.print("Digite o nome do produto: ");
        produto.setNome(leitor.nextLine());
        System.out.print("Digite o valor do produto: ");
        produto.setPreco(leitor.nextDouble());
        System.out.print("Digite a quantidade que tem no estoque: ");
        produto.setQuant(leitor.nextInt());


        System.out.println();
        System.out.print("Estoque: ");

        System.out.println();
        System.out.print("Digite a chegada de mais produto no estoque: ");
        produto.addProduto(leitor.nextInt());

        System.out.println();
        System.out.print("Estoque atualizado: " + produto.getQuant());

        System.out.println();
        System.out.print("Quantas saídas teve do estoque: ");
        produto.removerProduto(leitor.nextInt());

        System.out.println();
        System.out.print("Estoque no final do dia: " + produto);

        leitor.close();
    }
}
