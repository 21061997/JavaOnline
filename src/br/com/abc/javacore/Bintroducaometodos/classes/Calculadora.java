package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {


    public static void somaDoisNumeros() {

        System.out.println("A soma dos números é: " + (5 + 5));
    }

    public static void subtraiDoisNumero() {

        System.out.println("A subtração dos número é: " + (200 - 10));

    }


    public static void mutiplicaDoisNumeros(int primeiroNumero, int segundoNumero) {

        System.out.println((primeiroNumero * segundoNumero));


    }


    public static double divisaoDeDoisNumeros(double primeiroNumero, double segundoNumero) {

        if (segundoNumero != 0) {


            return primeiroNumero / segundoNumero;
        }

        return 0;


    }



    public static void imprimiDoisNumerosDivididos(double num1, double num2) {

        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Você não pode fazer divisão por um número 0");

    }


    public static void alteraDoidNumero(int num1, int num2) {

        num1 = 30;
        num2 = 40;
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);


    }

    public static void fazendoSomaDeVariosNumeros(int [] numeros){

        int aux = 0;

        for (int gaurdaValores: numeros) {

            aux += gaurdaValores;

        }

        System.out.println(aux);


    }
    public static void SomaDeVariosNumeroUtilizandoVarargs(int... numeros){
        int soma = 0;

        for(int guardaValor : numeros){
            soma += guardaValor;
        }

        System.out.println(soma);





    }


}
