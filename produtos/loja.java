package produtos;

import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Estoque produto = new Estoque();

        System.out.print("Digite o nome do produto: ");
        produto.nome = leitor.nextLine();
        System.out.print("Digite o valor do produto: ");
        produto.preco = leitor.nextDouble();
        System.out.print("Digite a quantidade que tem no estoque: ");
        produto.quant = leitor.nextInt();

        System.out.println();
        System.out.print("Estoque: ");

        System.out.println();
        System.out.print("Digite a chegada de mais produto no estoque: ");
        int add = leitor.nextInt();
        produto.addProduto(add);

        System.out.println();
        System.out.print("Estoque atualizado: ");

        System.out.println();
        System.out.print("Quantas saídas teve do estoque: ");
        add = leitor.nextInt();
        produto.removerProduto(add);

        System.out.println();
        System.out.print("Estoque no final do dia: ");

        leitor.close();
    }
}
