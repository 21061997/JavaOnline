package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {


    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento");
        funcionario.pagamento();
        System.out.println("Nome" + funcionario.getNome());
        System.out.println("Salário" + funcionario.getSalario());

        if (funcionario instanceof Gerente) {

            Gerente g = (Gerente) funcionario;// Realizando o casting
            System.out.println("Participação no Lucro da empresa: " + g.getParticipacaoNoLucroDaEmpresa());

        }

        if (funcionario instanceof Vendedor) {
            Vendedor v = (Vendedor) funcionario;
            System.out.println("Total de vendas: " + v.getTotalDeVendas());

        }


    }


}
