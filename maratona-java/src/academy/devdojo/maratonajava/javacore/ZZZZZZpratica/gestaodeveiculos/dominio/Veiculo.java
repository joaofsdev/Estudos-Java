package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodeveiculos.dominio;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected double valorFipe;

    public Veiculo(String marca, String modelo, double valorFipe) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorFipe = valorFipe;
    }

    public double calcularImposto() {
        double valorImposto = (this.valorFipe * 0.02);
        return  valorImposto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(double valorFipe) {
        this.valorFipe = valorFipe;
    }
}
