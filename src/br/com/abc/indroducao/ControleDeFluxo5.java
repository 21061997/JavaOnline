package br.com.abc.indroducao;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        double valoCarro = 30000;

        for (int parcelas = 1; parcelas <= valoCarro; parcelas++) {

            double valorParcelas = valoCarro / parcelas;

            if (valorParcelas >= 1000) {

                System.out.println(" Parcela " + parcelas+ "º" + " R$ " + valorParcelas);

            }else{
                break;
            }

            System.out.println("Fora do IF");


        }


    }
}
