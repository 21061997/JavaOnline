package br.com.abc.javacore.introducaoclasses.classes;

import javax.xml.bind.SchemaOutputResolver;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;


   public void imprimiProfessor(Professor professor){

       System.out.println(professor.nome);
       System.out.println(professor.matricula);
       System.out.println(professor.rg);
       System.out.println(professor.cpf);

   }




}
