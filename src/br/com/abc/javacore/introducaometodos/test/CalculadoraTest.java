package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumero();
        calculadora.mutiplicaDoisNumeros(10,10);
        Double guardaValor = calculadora.divisaoDeDoisNumeros(20,0);
        System.out.println("Imprimindo dois números divididos");
        calculadora.imprimiDoisNumerosDivididos(10,5);


        System.out.println(guardaValor);
    }
}
