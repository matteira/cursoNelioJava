package metodo_abstrato;

public class ContaSalva extends Conta {

    private Double juros;

    public ContaSalva() {
        super();
    }

    public ContaSalva(Integer numero, String titular, Double saldo, Double juros) {
        super(numero, titular, saldo);
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public void atualizarSaldo() {
        saldo += saldo * juros;
    }

    @Override
    public void saque(double conta) {
        saldo -= conta;
    }
}
