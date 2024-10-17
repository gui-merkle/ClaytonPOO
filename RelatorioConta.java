package bar;

public class RelatorioConta {
    public static void gerarRelatorio(Cliente cliente) {
        double consumo = CalculoConta.calcularConsumo(cliente);
        double couvert = CalculoConta.calcularCouvert(consumo);
        double ingresso = CalculoConta.calcularIngresso(cliente);
        double total = CalculoConta.calcularTotal(cliente);

        System.out.println("### RELATÓRIO DE CONSUMO ###");
        System.out.println("Consumo = R$ " + String.format("%.2f", consumo));
        System.out.println("Couvert = R$ " + String.format("%.2f", couvert));
        System.out.println("Ingresso = R$ " + String.format("%.2f", ingresso));
        System.out.println("Valor a pagar = R$ " + String.format("%.2f", total));
    }
}
