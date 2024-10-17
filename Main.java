package imposto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            double salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário anual:"));
            double rendaServicos = Double.parseDouble(JOptionPane.showInputDialog("Informe a renda com prestação de serviços:"));
            double ganhoCapital = Double.parseDouble(JOptionPane.showInputDialog("Informe o ganho de capital:"));
            double gastosMedicos = Double.parseDouble(JOptionPane.showInputDialog("Informe os gastos médicos anuais:"));
            double gastosEducacionais = Double.parseDouble(JOptionPane.showInputDialog("Informe os gastos educacionais anuais:"));

            Pessoa pessoa = new Pessoa(salarioAnual, rendaServicos, ganhoCapital, gastosMedicos, gastosEducacionais);
            RelatorioImposto.gerarRelatorio(pessoa);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        }
    }
}
