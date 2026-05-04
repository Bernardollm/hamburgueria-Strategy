package strategy;

public class EntregaExpressa implements EstrategiaEntrega {

    @Override
    public double calcularTaxa() {
        return 15.0;
    }

    @Override
    public String getDescricao() {
        return "Entrega expressa";
    }
}
