package br.com.abc.javacore.Dsobrecargametodos.test;

import br.com.abc.javacore.Dsobrecargametodos.classes.Funcionario;

import java.text.DecimalFormat;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Yuri Vaz Dos Santos", "1012.34556", 4000.00, "45464748");
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Maysa de Castro");
        funcionario1.setSalario(5000);
        funcionario1.setCpf("1010101");



        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        funcionario.imprimi();
        funcionario1.imprimi();



    }


}
