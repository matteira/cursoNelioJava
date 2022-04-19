package getAndSetWhitConstrutor;

public class Estoque {
    private String nome;
    private double preco;
    private int quant;

    public Estoque(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public Estoque(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant){
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
        return String.format("Estoque\n Nome: %s, Preco: %.2f, Quantidade: %d, Valor do estoque: %.2f."
                             , getNome(), getPreco(), getQuant(), valorEstoque());
    }
}
