package strategy;

public class EntregaBalcao implements EstrategiaEntrega {

    @Override
    public double calcularTaxa() {
        return 0.0;
    }

    @Override
    public String getDescricao() {
        return "Retirada no balcão";
    }
}
