package br.com.abc.indroducao.controlefluxo;

public class ExercicioControleDeFluxo2 {
    public static void main(String[] args) {
        /*Exrcise*/
        byte dia = 45;


        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia  útel");
                break;

            default:
                System.out.println("Opção inválida");
        }


    }
}
