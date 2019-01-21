package br.com.abc.indroducao;

public class ControleDeFluxo2 {
    public static void main(String[] args) {

        int idade = 20;
        int status = idade < 15 ? 1 : idade >= 15 && idade < 18 ? 2 : 3;//Operador Ternario
        String status_ = idade == 1 ? "infantil" : idade == 2 ? "Juvenil" : "Adulto";
        System.out.println(status_);


    }
}
