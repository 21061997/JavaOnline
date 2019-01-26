package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.*;

public class EstudentTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.notas = new double[]{9.5,5.5,8.5};
        estudante.nome = "Yuri Vaz Dos Santos";
        estudante.idade = 21;
        estudante.mediAluno(estudante.notas);

        Estudante estudante1 = new Estudante();
        estudante1.nome = "Jeovana de Castro Silva";
        estudante1.idade = 23;
        //estudante1.notas = new double[]{4.5,6.7,7.8};
        estudante1.mediAluno(estudante1.notas);

        Estudante estudante2 = new Estudante();
        estudante1.nome = "Milena dos Santos Peres";
        estudante1.idade = 22;
        estudante1.notas = new double[]{3.5,4.7,2.8};
        estudante1.mediAluno(estudante1.notas);



    }
}
