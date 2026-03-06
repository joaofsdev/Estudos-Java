package academy.devdojo.maratonajava.javacore.Fmodificarestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("To aq dentro");
        episodios = new int[3];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public static int[] getEpisodios() {
        return Anime.episodios;
    }
}
