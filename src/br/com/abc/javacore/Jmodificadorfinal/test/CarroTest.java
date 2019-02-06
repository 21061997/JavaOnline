package br.com.abc.javacore.Jmodificadorfinal.test;

import br.com.abc.javacore.Jmodificadorfinal.classes.Carro;
import br.com.abc.javacore.Jmodificadorfinal.classes.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.getComprador().setNome("Yuri Vaz Dos Santos");
        System.out.println("O comprador é: "+ carro.getComprador().getNome());




    }
}
