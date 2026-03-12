package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.desafios.estoque.dominio;

public abstract class Produto {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void imprime(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Valor do produto: " + this.valor);
    }

    public abstract double calcularImposto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
