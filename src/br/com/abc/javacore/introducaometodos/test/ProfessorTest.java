package br.com.abc.javacore.introducaometodos.test;
import  br.com.abc.javacore.introducaometodos.classes.*;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Yuri Vaz Dos Santos";
        professor.cpf = "1012131415";
        professor.rg = "20212223";
        professor.matricula = "100120";

        Professor professor2 = new Professor();
        professor2.nome = "Joana da Silva Melo";
        professor2.cpf = "14141441414441";
        professor2.rg = "09877655";
        professor2.matricula = "1444";

        professor.imprimiProfessor();
        professor2.imprimiProfessor();



    }
}
