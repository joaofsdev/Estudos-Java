package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodeveiculos.dominio;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, double valorFipe, double capacidadeCarga) {
        super(marca, modelo, valorFipe);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double calcularImposto(){
        double valorImposto = (this.valorFipe * 0.015) + 500;
        return valorImposto;
    }
}
