
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    // Construtor
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Getter para o nome do continente
    public String getNome() {
        return nome;
    }

    // Métodos
    public void adicionarPais(Pais pais) {
        if (!paises.contains(pais)) {
            paises.add(pais);
        }
    }

    public double calcularDimensaoTotal() {
        double total = 0;
        for (Pais pais : paises) {
            total += pais.getDimensao();
        }
        return total;
    }

    public long calcularPopulacaoTotal() {
        long total = 0;
        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }
        return total;
    }

    public double calcularDensidadePopulacional() {
        return calcularPopulacaoTotal() / calcularDimensaoTotal();
    }

    public Pais paisComMaiorPopulacao() {
        return paises.stream().max(Comparator.comparingLong(Pais::getPopulacao)).orElse(null);
    }

    public Pais paisComMenorPopulacao() {
        return paises.stream().min(Comparator.comparingLong(Pais::getPopulacao)).orElse(null);
    }

    public Pais paisComMaiorDimensao() {
        return paises.stream().max(Comparator.comparingDouble(Pais::getDimensao)).orElse(null);
    }

    public Pais paisComMenorDimensao() {
        return paises.stream().min(Comparator.comparingDouble(Pais::getDimensao)).orElse(null);
    }

    public double razaoTerritorialMaiorMenor() {
        Pais maior = paisComMaiorDimensao();
        Pais menor = paisComMenorDimensao();
        if (maior != null && menor != null) {
            return maior.getDimensao() / menor.getDimensao();
        }
        return 0;
    }
}
