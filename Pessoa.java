package imposto;

public class Pessoa {
    private double salarioAnual;
    private double rendaServicos;
    private double ganhoCapital;
    private double gastosMedicos;
    private double gastosEducacionais;

    public Pessoa(double salarioAnual, double rendaServicos, double ganhoCapital, double gastosMedicos, double gastosEducacionais) {
        this.salarioAnual = salarioAnual;
        this.rendaServicos = rendaServicos;
        this.ganhoCapital = ganhoCapital;
        this.gastosMedicos = gastosMedicos;
        this.gastosEducacionais = gastosEducacionais;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public double getRendaServicos() {
        return rendaServicos;
    }

    public double getGanhoCapital() {
        return ganhoCapital;
    }

    public double getGastosMedicos() {
        return gastosMedicos;
    }

    public double getGastosEducacionais() {
        return gastosEducacionais;
    }
}
