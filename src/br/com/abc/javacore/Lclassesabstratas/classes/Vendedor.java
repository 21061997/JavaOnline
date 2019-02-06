package br.com.abc.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor() {

    }

    @Override
    public void imprime() {

    }

    public Vendedor(String nome, String CLT, double salario, double totalVendas) {
        super(nome, CLT, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);

    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

}
