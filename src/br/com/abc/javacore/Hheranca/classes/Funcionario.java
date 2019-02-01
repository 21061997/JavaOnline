package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;

    }

    public Funcionario() {

    }

    public void print() {

        System.out.println("salario: " + this.salario);
        super.print();

    }

    public void imprimimndo() {
        System.out.println("Nome: " + this.nome);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
