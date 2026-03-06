package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public void imprime() {
        System.out.println("---- Aluno ----");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("---- Seminario ----");
            System.out.println("Titulo: " + this.seminario.getTitulo());
            System.out.println("");
        }
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }
}
