package br.com.abc.javacore.blocodeinicializacao.classes;

public class Cliente {
    private int[] parcelamento;

    {

        parcelamento = new int[100];

        for (int i = 1; i <= 100; i++) {
        System.out.print(parcelamento[i - 1] = i);



        }
    }


    public Cliente() {
    }

    public int[] getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(int[] parcelamento) {
        this.parcelamento = parcelamento;
    }


}
