package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Yuri Vaz Dos Santos");
        aluno.setIdade(21);
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Hugo Vaz Dos Santos");
        aluno2.setIdade(15);
        Seminario seminario = new Seminario("Como ser o melhor programador java");
        Seminario seminario2 = new Seminario("Como ser o melhor programador javaScript");
        Seminario seminario3 = new Seminario("Como ser o melhor Analista de sistemas ");
        Professor professor = new Professor();
        professor.setNome("João Carvalho");
        professor.setEspecialidade("Foda da programação Java");
        Local local = new Local();
        local.setBairro("Canadense");
        local.setRua("Fortaleza");
        //aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        seminario.setProfessor(professor);
        seminario.setLocal(local);
        //seminario.setAlunos(new Aluno[]{aluno, aluno2});
        professor.setSeminarios(new Seminario[]{seminario, seminario2, seminario3});
        seminario.print();
        aluno.print();
        aluno2.print();




    }
}
