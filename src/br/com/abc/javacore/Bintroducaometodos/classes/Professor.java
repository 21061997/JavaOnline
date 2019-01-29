package br.com.abc.javacore.Bintroducaometodos.classes;

public class Professor {

    public String nome;
    public String matricula;
    public String rg;
    public String cpf;


    public void imprimiProfessor(){

        /* Usando a palavra reservada this estamos falando pro metódo peagar o dados do objeto e mostrar, conforme ação solicitada*/
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.cpf);
        System.out.println("-----------------------------------------");



    }
}
