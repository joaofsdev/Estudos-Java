package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodeveiculos.test;

import academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodeveiculos.dominio.*;

public class VeiculoTest01 {
    public static void main(String[] args) {
        RelatorioVeiculo relatorio = new RelatorioVeiculo();
        Carro carro = new Carro("Chevrolet", "Corsa", 10000, 4);
        Moto moto = new Moto("Kawasaki", "Ninja", 20000, 300);
        Caminhao caminhao = new Caminhao("Scania", "113 360", 80000, 1000);

        Veiculo[] veiculos = {carro, moto, caminhao};

        for(Veiculo veiculo : veiculos){
            relatorio.imprime(veiculo);
        }
    }
}
