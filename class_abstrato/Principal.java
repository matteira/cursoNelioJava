package class_abstrato;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Conta> list = new ArrayList<>();

        list.add(new ContaSalva(1001, "Gabriel", 500.00, 0.01));
        list.add(new ContaComercial(1002, "Maria", 1000.0, 400.0));
        list.add(new ContaSalva(1003, "Alex", 300.00, 0.01));
        list.add(new ContaComercial(1004, "Ana", 500.0, 500.0));

        double sum = 0.0;
        for (Conta acc : list) {
            sum += acc.getSaldo();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Conta acc : list) {
            acc.deposito(10.0);
        }

        for (Conta acc : list){
            System.out.printf("Updated balance for account %d : %.2f%n", acc.getNumero(), acc.getSaldo());
        }
    }
}
