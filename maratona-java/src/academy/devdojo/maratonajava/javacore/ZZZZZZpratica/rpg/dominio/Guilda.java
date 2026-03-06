package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.rpg.dominio;

public class Guilda {
    private String nome;
    private Personagem[] membros;

    public Guilda(String nome) {
        this.nome = nome;
    }

    public Guilda(String nome, Personagem[] membros) {
        this(nome);
        this.membros = membros;
    }

    public void imprime() {
        System.out.println("Guilda: " + this.nome);
        for (Personagem membro : membros) {
            System.out.println("Membro: " + membro.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public Personagem[] getMembros() {
        return membros;
    }

    public void setMembros(Personagem[] membros) {
        this.membros = membros;
    }
}

