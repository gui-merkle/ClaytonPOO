
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o continente
        System.out.print("Digite o nome do continente: ");
        String nomeContinente = scanner.nextLine();
        Continente continente = new Continente(nomeContinente);

        // Adicionando países ao continente
        System.out.print("Quantos países deseja adicionar ao continente? ");
        int numPaises = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < numPaises; i++) {
            System.out.println("\n=== Adicionando país " + (i + 1) + " ===");
            System.out.print("Digite o código ISO do país: ");
            String codigoISO = scanner.nextLine();

            System.out.print("Digite o nome do país: ");
            String nomePais = scanner.nextLine();

            System.out.print("Digite a dimensão do país (em km²): ");
            double dimensao = scanner.nextDouble();

            System.out.print("Digite a população do país: ");
            long populacao = scanner.nextLong();
            scanner.nextLine(); // Consumir a quebra de linha

            // Criando o país e adicionando ao continente
            Pais pais = new Pais(codigoISO, nomePais, dimensao);
            pais.setPopulacao(populacao);
            continente.adicionarPais(pais);
        }

        // Exibindo as informações do continente
        System.out.println("\n=== Informações do Continente ===");
        System.out.println("Nome do continente: " + continente.getNome());
        System.out.println("População total: " + continente.calcularPopulacaoTotal());
        System.out.println("Dimensão total: " + continente.calcularDimensaoTotal());
        System.out.println("Densidade populacional: " + continente.calcularDensidadePopulacional());

        // Encontrando o país com maior e menor população
        Pais maiorPopulacao = continente.paisComMaiorPopulacao();
        Pais menorPopulacao = continente.paisComMenorPopulacao();

        System.out.println("\nPaís com maior população: " + maiorPopulacao.getNome());
        System.out.println("País com menor população: " + menorPopulacao.getNome());

        // Encontrando o país com maior e menor dimensão territorial
        Pais maiorDimensao = continente.paisComMaiorDimensao();
        Pais menorDimensao = continente.paisComMenorDimensao();

        System.out.println("País com maior dimensão: " + maiorDimensao.getNome());
        System.out.println("País com menor dimensão: " + menorDimensao.getNome());

        // Exibindo a razão territorial entre o maior e menor país
        System.out.println("Razão territorial maior/menor: " + continente.razaoTerritorialMaiorMenor());

        // Encerrando o scanner
        scanner.close();
    }
}
