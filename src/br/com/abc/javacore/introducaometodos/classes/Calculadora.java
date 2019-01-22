package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {


    public void somaDoisNumeros() {

        System.out.println("A soma dos números é: " + (5 + 5));
    }

    public void subtraiDoisNumero() {

        System.out.println("A subtração dos número é: " + (200 - 10));

    }


    public void mutiplicaDoisNumeros(int primeiroNumero, int segundoNumero) {

        System.out.println((primeiroNumero * segundoNumero));


    }


    public double divisaoDeDoisNumeros(double primeiroNumero, double segundoNumero) {


        return primeiroNumero / segundoNumero;
    }


}
