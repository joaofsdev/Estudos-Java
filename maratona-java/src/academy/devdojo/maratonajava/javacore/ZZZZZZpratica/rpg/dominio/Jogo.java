package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.rpg.dominio;

public class Jogo {
    public static void main(String[] args) {
        System.out.println("--- Iniciando RPG ---\n");
        Guilda guilda1 = new Guilda("Guardiões");
        Guilda guilda2 = new Guilda("Obscuros");

        Personagem guerreiro = new Personagem("Meliodas", "Guerreiro", guilda1, 40, 30, 80);
        Personagem lanceiro = new Personagem("King", "Lanceiro", guilda2, 50, 20, 70);

        Personagem[] membrosGuardiões = {guerreiro};
        Personagem[] membrosObscuros = {lanceiro};

        guilda1.setMembros(membrosGuardiões);
        guilda2.setMembros(membrosObscuros);

        guerreiro.atacar(lanceiro);
        lanceiro.atacar(guerreiro);
        System.out.println("");

        System.out.println("--- Status ---");

        guerreiro.imprimeStatus();
        System.out.println("------");
        lanceiro.imprimeStatus();

        System.out.println("\n--- Guildas ---");
        guilda1.imprime();
        System.out.println("------");
        guilda2.imprime();
    }
}
