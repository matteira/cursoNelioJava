package class_abstrato;

public class ContaComercial extends Conta {
    private Double emprestimoLimite;

    public ContaComercial() {
        super();
    }

    public ContaComercial(Integer numero, String titular, Double saldo, Double emprestimoLimite) {
        super(numero, titular, saldo);
        this.emprestimoLimite = emprestimoLimite;
    }

    public Double getEmprestimoLimite() {
        return emprestimoLimite;
    }

    public void setEmprestimoLimite(Double emprestimoLimite) {
        this.emprestimoLimite = emprestimoLimite;
    }

    public void emprestimo(double conta) {
        if (conta <= emprestimoLimite) {
            deposito(conta);
        }
    }

    @Override
    public void saque(double conta) {
        super.saque(conta);
        saldo -= 2.0;
    }
}
