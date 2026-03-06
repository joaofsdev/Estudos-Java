package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.rpg.dominio;

public class Personagem {
    private String nome;
    private String classeRpg;
    private Guilda guilda;
    private int forca;
    private int defesa;
    private int vida;

    {
        this.forca = 10;
        this.defesa = 10;
        this.vida = 10;
    }

    public Personagem(String nome, String classeRpg) {
        this.nome = nome;
        this.classeRpg = classeRpg;

        aplicarBonusClasse();
    }

    public Personagem(String nome, String classeRpg, Guilda guilda, int forca, int defesa, int vida) {
        this(nome, classeRpg);
        this.guilda = guilda;
        this.forca = forca;
        this.defesa = defesa;
        this.vida = vida;
    }

    public void imprimeStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe Rpg: " + this.classeRpg);
        System.out.println("Forca: " + this.forca);
        System.out.println("Defesa: " + this.defesa);
        System.out.println("Vida: " + this.vida);
        if (this.guilda != null) {
            System.out.println("Guilda: " + this.guilda.getNome());
        } else {
            System.out.println("Jogador não participa de uma guilda!");
        }
    }

    public void aplicarBonusClasse() {
        if (this.classeRpg.equalsIgnoreCase("Guerreiro")) {
            this.vida = (int) (this.vida * 1.1);
        } else if (this.classeRpg.equalsIgnoreCase("Lanceiro")) {
            this.forca = (int) (this.forca * 1.1);
        }
    }

    public void atacar(Personagem alvo) {
        int dano = this.forca - alvo.getDefesa();
        if (dano < 0) {
            dano = 0;
        }

        alvo.receberDano(dano);

        System.out.println(this.nome + " atacou " + alvo.getNome() + " e causou " + dano + " de dano!");
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            this.vida = 0;
        }
    }


    public String getNome() {
        return nome;
    }

    public String getClasseRpg() {
        return classeRpg;
    }

    public Guilda getGuilda() {
        return guilda;
    }

    public void setGuilda(Guilda guilda) {
        this.guilda = guilda;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVida() {
        return vida;
    }
}
