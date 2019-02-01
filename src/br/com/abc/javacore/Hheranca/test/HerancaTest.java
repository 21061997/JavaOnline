package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Yuri Vaz Dos Santos");
        pessoa.setCpf("101213-1415");
        Endereco endereco = new Endereco();
        endereco.setRua("Amarante");
        endereco.setBairro("Vila Boa");
        pessoa.setEndereco(endereco);
        pessoa.print();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Bruna vaz de oliveira");
        funcionario.setCpf("10123333-333");
        funcionario.setSalario(5000.0);
        funcionario.setEndereco(endereco);
        funcionario.print();


    }
}
