package imposto;

public class RelatorioImposto {
    public static void gerarRelatorio(Pessoa pessoa) {
        double impostoSalario = CalculoImposto.calcularImpostoSalario(pessoa);
        double impostoServicos = CalculoImposto.calcularImpostoServicos(pessoa);
        double impostoGanhoCapital = CalculoImposto.calcularImpostoGanhoCapital(pessoa);
        double impostoBruto = CalculoImposto.calcularImpostoBruto(pessoa);
        double abatimento = CalculoImposto.calcularAbatimento(pessoa);
        double impostoDevido = impostoBruto - abatimento;

        System.out.println("Renda anual com salário: " + String.format("%.2f", pessoa.getSalarioAnual()));
        System.out.println("Renda anual com prestação de serviço: " + String.format("%.2f", pessoa.getRendaServicos()));
        System.out.println("Renda anual com ganho de capital: " + String.format("%.2f", pessoa.getGanhoCapital()));
        System.out.println("Gastos médicos: " + String.format("%.2f", pessoa.getGastosMedicos()));
        System.out.println("Gastos educacionais: " + String.format("%.2f", pessoa.getGastosEducacionais()));
        System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.println("Imposto sobre salário: " + String.format("%.2f", impostoSalario));
        System.out.println("Imposto sobre serviços: " + String.format("%.2f", impostoServicos));
        System.out.println("Imposto sobre ganho de capital: " + String.format("%.2f", impostoGanhoCapital));
        System.out.println("* DEDUÇÕES:");
        System.out.println("Máximo dedutível: " + String.format("%.2f", impostoBruto * 0.30));
        System.out.println("Gastos dedutíveis: " + String.format("%.2f", pessoa.getGastosMedicos() + pessoa.getGastosEducacionais()));
        System.out.println("* RESUMO:");
        System.out.println("Imposto bruto total: " + String.format("%.2f", impostoBruto));
        System.out.println("Abatimento: " + String.format("%.2f", abatimento));
        System.out.println("Imposto devido: " + String.format("%.2f", impostoDevido));
    }
}
