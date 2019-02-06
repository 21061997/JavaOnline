package br.com.abc.javacore.Lclassesabstratas.classes;

public class Gerente extends Funcionario {
    public Gerente() {
    }

    @Override
    public void imprime() {

    }

    public Gerente(String nome, String CLT, double salario) {
        super(nome, CLT, salario);
    }

    public void calculaSalario(){

        this.salario = salario +(salario * 0.2);
    }

}
