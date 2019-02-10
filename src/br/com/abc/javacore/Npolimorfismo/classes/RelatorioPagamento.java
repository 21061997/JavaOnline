package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {


    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento");
        funcionario.pagamento();
        System.out.println("Nome" + funcionario.getNome());
        System.out.println("Salário" + funcionario.getSalario());


    }


}
