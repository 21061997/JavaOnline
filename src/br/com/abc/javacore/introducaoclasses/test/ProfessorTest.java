package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Dayne Nunes de Oliveira";
        professor.matricula = "1011121314";
        professor.cpf = "000001111222";
        professor.rg = "123434000";

        Professor professor2 = new Professor();
        professor2.nome = "Valéria de Sousa Nunes ";
        professor2.matricula = "90807060";
        professor2.cpf = "4444466666";
        professor2.rg = "334546456";


        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);

        System.out.println(professor2.nome);
        System.out.println(professor2.matricula);
        System.out.println(professor2.cpf);
        System.out.println(professor2.rg);


    }
}
