package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.*;

public class EstudentTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Yuri vaz");
        estudante.setIdade(21);
        estudante.setNotas(new double[]{3.5,9.0,10.0});
        estudante.mediAluno(estudante.getNotas());
        System.out.println("Aprovado: " + estudante.isAprovado());





    }
}
