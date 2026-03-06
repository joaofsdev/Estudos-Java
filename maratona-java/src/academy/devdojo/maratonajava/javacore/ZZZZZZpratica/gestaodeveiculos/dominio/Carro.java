package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodeveiculos.dominio;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, double valorFipe, int quantidadePortas) {
        super(marca, modelo, valorFipe);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularImposto() {
        double valorImposto = (this.valorFipe * 0.04);
        return valorImposto;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
