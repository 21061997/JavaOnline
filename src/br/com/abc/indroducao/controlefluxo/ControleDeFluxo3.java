package br.com.abc.indroducao.controlefluxo;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        byte dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;

        }

        System.out.println("*********************************************\n");
        char sexo = 'S';

        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Maculino");
                break;

            default:
                System.out.println("Nenhuma opção encontrada");


        }



    }
}
