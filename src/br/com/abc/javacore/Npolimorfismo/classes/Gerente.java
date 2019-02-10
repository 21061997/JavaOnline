package br.com.abc.javacore.Npolimorfismo.classes;

public class Gerente extends Funcionario {

    private double participacaoNoLucroDaEmpresa;

    public Gerente(String nome, double salario, double participacaoNoLucroDaEmpresa) {
        super(nome, salario);
        this.participacaoNoLucroDaEmpresa = participacaoNoLucroDaEmpresa;
    }

    public double getParticipacaoNoLucroDaEmpresa() {
        return participacaoNoLucroDaEmpresa;
    }

    public void setParticipacaoNoLucroDaEmpresa(double participacaoNoLucroDaEmpresa) {
        this.participacaoNoLucroDaEmpresa = participacaoNoLucroDaEmpresa;
    }

    @Override
    public void pagamento() {
        this.salario = (this.salario + this.participacaoNoLucroDaEmpresa);
    }


}
