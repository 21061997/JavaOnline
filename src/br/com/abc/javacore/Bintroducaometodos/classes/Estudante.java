package br.com.abc.javacore.Bintroducaometodos.classes;

import java.text.DecimalFormat;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    DecimalFormat decimalFormat = new DecimalFormat("0.0");

    public void mediAluno(double notas[]) {
        this.notas = notas;
        if (this.notas == null) {
            System.out.println("O aluno " + this.nome + "não possuí notas cadastradas no sistema");
            return; // Para sair do metódo
        }

        double soma = 0;
        for (double notass : notas) {
            soma += notass;
        }

        double mediaAluno = soma / 3;
        if (mediaAluno < 6.0) {
            this.aprovado = false;
            System.out.println("O aluno," + this.nome + "de idade, " + this.idade + " teve sua média " + decimalFormat.format(mediaAluno) + " portanto esta reprovado");
        } else {
            this.aprovado = true;
            System.out.println("O aluno," + this.nome + "de idade, " + this.idade + " teve sua média " + decimalFormat.format(mediaAluno) + " portanto esta aprovado");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double notas[]) {
        this.notas = notas;

    }

    public double[] getNotas() {

        return this.notas;
    }

    public boolean isAprovado() { // Declaração do metódo boolean

        return this.aprovado;
    }


}
