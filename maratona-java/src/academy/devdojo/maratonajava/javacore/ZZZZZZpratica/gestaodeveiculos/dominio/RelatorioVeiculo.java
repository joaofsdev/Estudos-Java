package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodeveiculos.dominio;

public class RelatorioVeiculo {
    public void imprime(Veiculo veiculo) {
        System.out.println("--- RELATÓRIO DE IMPOSTO ---");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());

        double valorImposto = veiculo.calcularImposto();

        System.out.println("Valor do imposto: R$ " + valorImposto);
        System.out.println("----------------------------");
    }
}
