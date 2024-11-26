import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private List<Pais> fronteiras;

    // Construtor
    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    // Getters e Setters
    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    // Métodos
    public void adicionarFronteira(Pais pais) {
        if (!this.fronteiras.contains(pais) && this.fronteiras.size() < 40) {
            this.fronteiras.add(pais);
            pais.getFronteiras().add(this); // Garantir bidirecionalidade
        }
    }

    public boolean isMesmoPais(Pais outro) {
        return this.codigoISO.equals(outro.getCodigoISO());
    }

    public boolean isLimitrofe(Pais outro) {
        return this.fronteiras.contains(outro);
    }

    public double calcularDensidadePopulacional() {
        return this.populacao / this.dimensao;
    }

    public List<Pais> vizinhosComuns(Pais outro) {
        List<Pais> comuns = new ArrayList<>();
        for (Pais pais : this.fronteiras) {
            if (outro.getFronteiras().contains(pais)) {
                comuns.add(pais);
            }
        }
        return comuns;
    }
}
