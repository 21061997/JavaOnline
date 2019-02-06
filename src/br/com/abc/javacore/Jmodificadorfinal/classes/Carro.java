package br.com.abc.javacore.Jmodificadorfinal.classes;

public class Carro {
    public static final double VELOCIDADE_LIMITE = 250;
    private String carro;
    private String nome;
    private String marca;
    public final Comprador comprador = new Comprador();

    public final void imprimi(){

    }


    public Comprador getComprador() {
        return comprador;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "carro='" + carro + '\'' +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
