package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    // Atividade
    static void main(String[] args) {
        int salarioAnual = 34712;
        double taxaImposto;
        double totalImpostoPago;

        taxaImposto = salarioAnual <= 34712 ? 0.0970 : salarioAnual <= 68507 ? 0.3735 : 0.4950;
        totalImpostoPago = salarioAnual * taxaImposto;

        System.out.println("Seu salario e de: " + salarioAnual + ", Voce deve pagar uma taxa de imposto de: " + taxaImposto);
        System.out.println("Total de Imposto Pago: " + totalImpostoPago);
    }
}
