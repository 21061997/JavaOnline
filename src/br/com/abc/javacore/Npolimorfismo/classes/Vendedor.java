package br.com.abc.javacore.Npolimorfismo.classes;

import java.text.DecimalFormat;

public class Vendedor extends Funcionario {


    private double totalDeVendas;

    public Vendedor(String nome, double salario, double totalDeVendas) {
        super(nome, salario);
        this.totalDeVendas = totalDeVendas;

    }

    @Override
    public void pagamento() {
        this.salario = this.salario + (this.totalDeVendas * 0.05);
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;

    }

    public double getTotalDeVendas() {

        int receberTotalDeVedas = (int) this.totalDeVendas;

        return receberTotalDeVedas;
    }


}
