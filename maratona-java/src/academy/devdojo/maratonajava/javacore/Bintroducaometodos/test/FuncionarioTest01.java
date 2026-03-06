package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1400, 1600, 1900});

        funcionario.imprimir();
        funcionario.mediaSalario();
    }
}
