package br.com.abc.javacore.introducaoclasses.test;

import  br.com.abc.javacore.introducaoclasses.classes.*;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.placa ="hcm-7432";
        carro.marca ="ford";
        carro.velocidade = 220f;

        System.out.println(carro.placa);
        System.out.println(carro.marca);
        System.out.println(carro.velocidade);



    }
}
