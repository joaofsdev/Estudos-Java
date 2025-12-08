package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operador Ternario = (condicao) ? verdadeiro : falso;
        // Doar se Salario for > que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "ainda nao tenho condicoes, mas vou ter!";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        int idade = 100;
        String categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto"; // Operador ternario com Else IF

        System.out.println(resultado);
    }
}
