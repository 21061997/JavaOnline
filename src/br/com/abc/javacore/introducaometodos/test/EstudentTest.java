package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.*;

public class EstudentTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        double[] notas = new double[3];
        notas[0] = 9.5;
        notas[1] = 5.5;
        notas[2] = 8.5;
        estudante.nome = "Yuri Vaz Dos Santos";
        estudante.idade = 21;
        estudante.mediAluno(notas);


    }
}
