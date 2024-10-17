package imposto;

public class CalculoImposto {
    public static double calcularImpostoSalario(Pessoa pessoa) {
        double salarioMensal = pessoa.getSalarioAnual() / 12;
        if (salarioMensal < 3000) {
            return 0;
        } else if (salarioMensal < 5000) {
            return pessoa.getSalarioAnual() * 0.10;
        } else {
            return pessoa.getSalarioAnual() * 0.20;
        }
    }

    public static double calcularImpostoServicos(Pessoa pessoa) {
        return pessoa.getRendaServicos() * 0.15;
    }

    public static double calcularImpostoGanhoCapital(Pessoa pessoa) {
        return pessoa.getGanhoCapital() * 0.20;
    }

    public static double calcularTotalImposto(Pessoa pessoa) {
        double impostoSalario = calcularImpostoSalario(pessoa);
        double impostoServicos = calcularImpostoServicos(pessoa);
        double impostoGanhoCapital = calcularImpostoGanhoCapital(pessoa);
        double impostoBruto = impostoSalario + impostoServicos + impostoGanhoCapital;
        double abatimento = Math.min(impostoBruto * 0.30, pessoa.getGastosMedicos() + pessoa.getGastosEducacionais());
        return impostoBruto - abatimento;
    }

    public static double calcularImpostoBruto(Pessoa pessoa) {
        return calcularImpostoSalario(pessoa) + calcularImpostoServicos(pessoa) + calcularImpostoGanhoCapital(pessoa);
    }

    public static double calcularAbatimento(Pessoa pessoa) {
        double impostoBruto = calcularImpostoBruto(pessoa);
        return Math.min(impostoBruto * 0.30, pessoa.getGastosMedicos() + pessoa.getGastosEducacionais());
    }
}
