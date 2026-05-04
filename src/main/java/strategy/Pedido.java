package strategy;

public class Pedido {

    private double valorHamburguer;
    private EstrategiaEntrega estrategiaEntrega;

    public Pedido(double valorHamburguer) {
        this.valorHamburguer = valorHamburguer;
    }

    public void setEstrategiaEntrega(EstrategiaEntrega estrategiaEntrega) {
        this.estrategiaEntrega = estrategiaEntrega;
    }

    public double calcularTotal() {
        return valorHamburguer + estrategiaEntrega.calcularTaxa();
    }

    public String getTipoEntrega() {
        return estrategiaEntrega.getDescricao();
    }
}
