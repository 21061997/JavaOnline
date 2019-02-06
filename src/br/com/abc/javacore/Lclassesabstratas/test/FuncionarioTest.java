package br.com.abc.javacore.Lclassesabstratas.test;

import br.com.abc.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Anna Silva", "9999999999", 2000);
        Vendedor vendedor = new Vendedor("Julianna", "2-4455566", 1500, 50000);
        g.calculaSalario();
        System.out.println(g);
        vendedor.calculaSalario();
        System.out.println(vendedor);




    }
}
