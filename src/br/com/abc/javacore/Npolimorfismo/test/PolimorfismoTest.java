package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.Funcionario;
import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Osvaldo", 5000, 2000);
        Vendedor vendedor = new Vendedor("Yuri", 2000, 20000);
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
        //relatorioPagamento.relatorioPagamentoGerente(gerente);
        //relatorioPagamento.relatorioPagamentoVendedor(vendedor);
        relatorioPagamento.relatorioPagamentoGenerico(gerente);
        relatorioPagamento.relatorioPagamentoGenerico(vendedor);
        Funcionario funcionario = gerente;
        System.out.println("###################################");
        System.out.println(funcionario.getSalario());






    }
}
