package br.com.abc.javacore.Hheranca.classes;

public class Pessoa extends Object {
    protected String nome; // Quero apenas que as classses herdeiras acessem os atributos, dessa fomrma estou usando protected
    protected String cpf;
    protected Endereco endereco;


    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;

    }

    public Pessoa() {

    }


    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("******************Endereço*************");
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Rua: " + endereco.getRua());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
