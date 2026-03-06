package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.dominio;

public class Local {
    private String endereco;

    {
        this.endereco = "Rua dos Seminarios 1001";
    }
    public Local(String endereco) {

    }
    public void imprime() {
        System.out.println("---- Local ----");
        System.out.println("Endereço: " + this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
