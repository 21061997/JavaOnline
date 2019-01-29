package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumero();
        Calculadora.mutiplicaDoisNumeros(10,10);
        Double guardaValor = calculadora.divisaoDeDoisNumeros(20,0);
        System.out.println("Imprimindo dois números divididos");
        calculadora.imprimiDoisNumerosDivididos(10,5);

        int[] valorAlocadoNaMemoria = new int[]{1,2,3,4,5};
        Calculadora.fazendoSomaDeVariosNumeros(valorAlocadoNaMemoria);
        System.out.println(guardaValor);
        System.out.println("Varargs");
        Calculadora.SomaDeVariosNumeroUtilizandoVarargs(1,2,3,4,5);



    }
}
