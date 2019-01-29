package br.com.abc.javacore.Csobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String datamatricula;


    public Estudante(String matricula, String nome, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;

    }

    public Estudante(String matricula, String nome, double[] notas, String datamatricula) {
        this(matricula, nome, notas);
        this.datamatricula = datamatricula;

    }

    public Estudante() {
        System.out.println("Este que vai ser executado");

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDatamatricula() {
        return datamatricula;
    }

    public void setDatamatricula(String datamatricula) {
        this.datamatricula = datamatricula;
    }

    public void lerDados() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double recebenotas : this.notas) {

            System.out.println(recebenotas);

        }

    }

    {
        System.out.println("Iniciando o código");
    }


}
