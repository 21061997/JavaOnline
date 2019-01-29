package br.com.abc.javacore.Fmodificadostatico.test;

import br.com.abc.javacore.Fmodificadostatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);

        Carro carro = new Carro("Mercedez", 300);
        Carro carro2 = new Carro("Fiat", 120);
        Carro carro3 = new Carro("Ford", 200);
        carro.imprimi();
        carro2.imprimi();
        carro3.imprimi();








    }
}
