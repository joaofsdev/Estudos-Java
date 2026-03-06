package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCpf("012345-209");
        Pessoa pessoa = new Pessoa("João");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("João", 1800);
        funcionario.setCpf("11111112");
        funcionario.setEndereco(endereco);
        System.out.println("----------------");
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
