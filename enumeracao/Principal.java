package enumeracao;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Order pedido = new Order(1000, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido);

        //Sem o distanciamento.

        OrderStatus p1 = OrderStatus.ENTREGUE;
        OrderStatus p2 = OrderStatus.valueOf("ENTREGUE");
    }
}
