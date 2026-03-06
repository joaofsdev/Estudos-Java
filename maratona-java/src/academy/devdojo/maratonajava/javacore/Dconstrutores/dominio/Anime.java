package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String estudio;

    public Anime(String nome, String tipo, String genero, int episodios) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }

    public Anime(String nome, String tipo, String genero, int episodios, String estudio) {
        this( nome, tipo, genero, episodios);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Genero: " + genero);
        System.out.println("Episodios: " + episodios);
        System.out.println("Estudio: " + estudio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

}
