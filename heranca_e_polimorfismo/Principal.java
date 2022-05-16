package heranca_e_polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Conta acc = new Conta(1001, "Gabriel", 0.0);
        ContaComercial contaComercio = new ContaComercial(1002, "Toninho", 0.0, 400.0);

        // UPCASTING

        Conta acc1 = contaComercio;
        Conta acc2 = new ContaComercial(1003, "Andre", 0.0, 200.0);
        Conta acc3 = new ContaSalva(1004, "Vick", 0.0, 0.50);

        // DOWNCASTING

        ContaComercial acc4 = (ContaComercial) acc2;
        acc4.emprestimo(200.0);

        if (acc3 instanceof ContaComercial) {
            ContaComercial acc5 = (ContaComercial) acc3;
            acc5.emprestimo(300.0);
            System.out.println("Emprestimo");
        }

        if (acc3 instanceof ContaSalva) {
            ContaSalva acc5 = (ContaSalva) acc3;
            acc5.atualizarSaldo();
            System.out.println("Saldo atualizado");
        }

        //Sobreposição

        Conta acc6 = new ContaSalva(1006, "Jonas", 1000.0, 0.05);
        acc6.saque(500.00);
        System.out.println(acc6.getSaldo());
    }
}
