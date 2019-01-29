package br.com.abc.javacore.Fmodificadostatico.classes;

public class Cliente {
    private static int[] parcelamento;

    static {

        System.out.println("Dentro do bloco de iniialização");
        parcelamento = new int[100];

        for (int i = 1; i <= 100; i++) {
            System.out.print(parcelamento[i - 1] = i);
            System.out.println(" ");


        }
    }

    static {

        System.out.println("Segundo bloco");
    }

    static {

        System.out.println("Terceiro bloco");
    }


    public Cliente() {
    }

    public static int[] getParcelamento() {
        return parcelamento;
    }


}
