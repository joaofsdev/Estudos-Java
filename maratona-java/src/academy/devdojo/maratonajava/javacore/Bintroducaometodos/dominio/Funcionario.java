package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double salarioTotal = 0;

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        double salarioTotal = 0;
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Salarios: " + salarios[i]);
            salarioTotal += salarios[i];
        }
        System.out.println("Salario Total: " + salarioTotal);
    }

    public void mediaSalario() {
        if (this.salarios == null) {
            return;
        }
        double salarioTotal = 0;
        for (int i = 0; i < salarios.length; i++) {
            salarioTotal += salarios[i];
        }

        int mesesRecebidos = 0;
        for (int j = 0; j < salarios.length; j++) {
            mesesRecebidos += 1;
        }

        double mediaSalarial = salarioTotal / mesesRecebidos;
        System.out.println("A média salarial foi: " + mediaSalarial);
    }
}
