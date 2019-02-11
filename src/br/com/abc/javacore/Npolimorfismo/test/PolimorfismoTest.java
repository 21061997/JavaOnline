package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.Funcionario;
import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Osvaldo", 5000, 2000);
        Vendedor vendedor = new Vendedor("Yuri", 2000, 20);
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
        //relatorioPagamento.relatorioPagamentoGerente(gerente);
        //relatorioPagamento.relatorioPagamentoVendedor(vendedor);


        relatorioPagamento.relatorioPagamentoGenerico(gerente);
        System.out.println("-----------------------------------------------x");
        relatorioPagamento.relatorioPagamentoGenerico(vendedor);





    }
}
