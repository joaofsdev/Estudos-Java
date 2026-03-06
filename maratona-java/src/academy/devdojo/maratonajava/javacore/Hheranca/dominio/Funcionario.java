package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco estatico de funcionario");
    }

    {
        System.out.println("Bloco de inicializacao de funcionario");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public Funcionario(String nome, double salario){
        super(nome);
        this.salario = salario;
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("salario: " + this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario de R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
