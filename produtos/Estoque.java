package produtos;

public class Estoque {
    public String nome;
    public double preco;
    public int quant;

    public double valorEstoque(){
        return preco * quant;
    }

    public void addProduto(int quanto){
        this.quant += quanto;
    }

    public void removerProduto(int quanto){
        this.quant -= quanto;
    }

    @Override
    public String toString() {
        return "Estoque\n" + "Nome: '" + nome + ", Preço = " + preco + ", Quantidade = " + quant + ", valor total do estoque: " + valorEstoque();
    }
}
