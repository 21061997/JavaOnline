package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

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

        professor.imprimiProfessor(professor);
        professor2.imprimiProfessor(professor2);

    }
}
