package br.com.abc.javacore.introducaometodos.classes;

import java.text.DecimalFormat;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas = new double[3];

    DecimalFormat decimalFormat = new DecimalFormat("0.0");


    public void mediAluno(double notas[]) {
        this.notas = notas;
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double mediaAluno = soma / 3;
        if (mediaAluno < 6.0) {
            System.out.println("O aluno," + this.nome + "de idade, " + this.idade + " teve sua média " + decimalFormat.format(mediaAluno) + " portanto esta reprovado");
        }else{
            System.out.println("O aluno," + this.nome + "de idade, " + this.idade + " teve sua média " + decimalFormat.format(mediaAluno)  + " portanto esta aprovado");
        }


    }


}
