package construtor;

import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = leitor.nextLine();
        System.out.print("Digite o valor do produto: ");
        double preco = leitor.nextDouble();
        System.out.print("Digite a quantidade que tem no estoque: ");
        int quant = leitor.nextInt();

        Estoque produto = new Estoque(nome, preco, quant);

        System.out.println();
        System.out.print("Estoque: ");

        System.out.println();
        System.out.print("Digite a chegada de mais produto no estoque: ");
        quant = leitor.nextInt();
        produto.addProduto(quant);

        System.out.println();
        System.out.print("Estoque atualizado: ");

        System.out.println();
        System.out.print("Quantas saídas teve do estoque: ");
        quant = leitor.nextInt();
        produto.removerProduto(quant);

        System.out.println();
        System.out.print("Estoque no final do dia: " + produto);

        leitor.close();
    }
}
