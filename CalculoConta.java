package bar;

public class CalculoConta {
    private static final int PRECO_INGRESSO_HOMEM = 10;
    private static final int PRECO_INGRESSO_MULHER = 8;
    private static final int PRECO_CERVEJA = 5;
    private static final int PRECO_REFRIGERANTE = 3;
    private static final int PRECO_ESPETINHO = 7;
    private static final int COUVERT_ARTISTICO = 4;

    public static double calcularConsumo(Cliente cliente) {
        return (cliente.getQuantidadeCervejas() * PRECO_CERVEJA) +
               (cliente.getQuantidadeRefrigerantes() * PRECO_REFRIGERANTE) +
               (cliente.getQuantidadeEspetinhos() * PRECO_ESPETINHO);
    }

    public static double calcularCouvert(double consumo) {
        return consumo > 30 ? 0 : COUVERT_ARTISTICO;
    }

    public static double calcularIngresso(Cliente cliente) {
        return cliente.getSexo() == 'M' ? PRECO_INGRESSO_HOMEM : PRECO_INGRESSO_MULHER;
    }

    public static double calcularTotal(Cliente cliente) {
        double consumo = calcularConsumo(cliente);
        double couvert = calcularCouvert(consumo);
        double ingresso = calcularIngresso(cliente);
        return consumo + couvert + ingresso;
    }
}
