package br.com.abc.javacore.Fmodificadostatico.classes;

public class Carro {
    //Velocidade limite de 200km/h
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite;


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public Carro() {

    }

    public  static  void setVelocidadeLimite(double velocidadeLimite){

        Carro.velocidadeLimite = velocidadeLimite;
    }

    public  static double getVelocidadeLimite(){

        return velocidadeLimite;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }



    public void imprimi() {
        System.out.println("---------------------------------");
        System.out.println("Marca " + this.nome);
        System.out.println("Velocidade Limite " + velocidadeLimite);
        System.out.println("Velocidade maxima " + this.velocidadeMaxima);


    }
}
