package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumero();
        calculadora.mutiplicaDoisNumeros(10,10);
        Double guardaValor = calculadora.divisaoDeDoisNumeros(20,2);
        System.out.println(guardaValor);
    }
}
