package bar;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            char sexo = JOptionPane.showInputDialog("Informe o sexo (F ou M):").charAt(0);
            int quantidadeCervejas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de cervejas:"));
            int quantidadeRefrigerantes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de refrigerantes:"));
            int quantidadeEspetinhos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de espetinhos:"));

            Cliente cliente = new Cliente(sexo, quantidadeCervejas, quantidadeRefrigerantes, quantidadeEspetinhos);
            RelatorioConta.gerarRelatorio(cliente);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um caractere válido para o sexo.");
        }
    }
}
