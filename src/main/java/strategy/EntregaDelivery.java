package strategy;

public class EntregaDelivery implements EstrategiaEntrega {

    @Override
    public double calcularTaxa() {
        return 8.0;
    }

    @Override
    public String getDescricao() {
        return "Entrega delivery";
    }
}
