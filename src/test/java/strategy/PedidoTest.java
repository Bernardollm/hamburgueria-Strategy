package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularPedidoComRetiradaNoBalcao() {
        Pedido pedido = new Pedido(25.0);
        pedido.setEstrategiaEntrega(new EntregaBalcao());

        assertEquals("Retirada no balcão", pedido.getTipoEntrega());
        assertEquals(25.0, pedido.calcularTotal());
    }

    @Test
    void deveCalcularPedidoComDelivery() {
        Pedido pedido = new Pedido(25.0);
        pedido.setEstrategiaEntrega(new EntregaDelivery());

        assertEquals("Entrega delivery", pedido.getTipoEntrega());
        assertEquals(33.0, pedido.calcularTotal());
    }

    @Test
    void deveCalcularPedidoComEntregaExpressa() {
        Pedido pedido = new Pedido(25.0);
        pedido.setEstrategiaEntrega(new EntregaExpressa());

        assertEquals("Entrega expressa", pedido.getTipoEntrega());
        assertEquals(40.0, pedido.calcularTotal());
    }
}
