package academy.devdojo.maratonajava.javacore.Fmodificarestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificarestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 300);
        Carro carro3 = new Carro("Audi", 270);

        Carro.setVelocidadeLimite(220);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
