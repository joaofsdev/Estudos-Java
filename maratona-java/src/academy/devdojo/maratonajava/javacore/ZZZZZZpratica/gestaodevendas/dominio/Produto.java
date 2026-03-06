package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodevendas.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private double desconto;

    {
        this.quantidadeEstoque = 10;
        this.desconto = 0.0;
    }

    public Produto() {
        System.out.println("Cadastrando novo produto no sistema...");
    }

    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int quantidadeEstoque, double desconto) {
        this(nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
        this.desconto = desconto;
    }

    public void imprimeDados() {
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
        System.out.println("Quantidade do produto: " + this.quantidadeEstoque);
        System.out.println("Desconto do produto: " + this.desconto);
    }

    public double calcularPrecoFinal() {
        double precoDesconto = preco * (desconto / 100);
        return this.preco - precoDesconto;
    }

    public void realizarVenda(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso! Total: " + calcularPrecoFinal());
        } else {
            System.out.println("Estoque insuficiente para o produto " + this.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
