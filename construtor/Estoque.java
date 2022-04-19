package construtor;

public class Estoque {
    public String nome;
    public double preco;
    public int quant;

    public Estoque(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

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
        return "Estoque\n" + "Nome: '" + nome + ", Preço = " + preco + ", Quantidade = " + quant +
                ", valor total do estoque: " + valorEstoque();
    }
}
