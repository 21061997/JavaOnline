package br.com.abc.javacore.Gassociacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario(String titulo) {
        this.titulo = titulo;

    }

    public Seminario() {
    }

    public void print() {
        System.out.println("------------------------Relatório de Seminário--------------------");
        System.out.println("Titulo: " + this.titulo);
        if (this.professor != null) {

            System.out.println("Professor palestrante: " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor cadastrado");
        }
        if (this.local != null) {

            System.out.println("Local, rua e bairro " + this.local.getRua() + " " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado");
        }
        if (this.alunos != null && this.alunos.length != 0) {

            System.out.println("Alunos Participantes");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        } else {

            System.out.println("Nenhum aluno cadastrado");
        }


    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
