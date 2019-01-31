package br.com.abc.javacore.Gassociacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("-----------------Relatório Professor----------------");

        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade do professor: " + this.especialidade);
        if (this.seminarios != null && this.seminarios.length != 0) {// Verificando se objeto está nulo e se o array está como zero

            System.out.println("Seminários partivipantes");
            for (Seminario seminario_ : this.seminarios) {
                System.out.println(seminario_.getTitulo() + " ");

            }
        } else {

            System.out.println("Nenhum seminário cadastrado");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
