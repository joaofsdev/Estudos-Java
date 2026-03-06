package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodeveiculos.dominio;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, double valorFipe, int cilindradas) {
        super(marca, modelo, valorFipe);
        this.cilindradas = cilindradas;
    }

    public double calcularImposto() {
        double valorImposto = (this.valorFipe * 0.01);
        return valorImposto;
    }

    public int getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(int cilindradas) {
    }
}
