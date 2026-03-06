package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Uno";
        carro1.modelo = "Mille";
        carro1.ano = 2007;

        carro2.nome = "Ferrari";
        carro2.modelo = "Spider";
        carro2.ano = 2021;

        carro1.imprimir();
        System.out.println("------------------");
        carro2.imprimir();
    }
}
