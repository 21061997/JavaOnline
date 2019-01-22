package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante joao = new Estudante();
        joao.nome = "João da silva uberne";
        joao.idade = 23;
        joao.matricula = "121314";

        System.out.println(joao.matricula);
        System.out.println(joao.nome);
        System.out.println(joao.idade);


    }

}
