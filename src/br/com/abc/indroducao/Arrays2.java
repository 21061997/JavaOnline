package br.com.abc.indroducao;

public class Arrays2 {
    public static void main(String[] args) {

        String[] nome = new String[7];
        nome[0] = "Yuri";
        nome[1] = "Myrella";
        nome[2] = "Jeovanna";
        nome[3] = "Fernada";
        nome[4] = "Leticia";
        nome[5] = "Carmen";
        nome[6] = "Juliana";


        System.out.println("Tamanho do array: " + nome.length + "  posições");

        for (int i = 0; i < nome.length; i++) {
            System.out.println(i + 1 + "º" + "Nome: " + nome[i]);

        }


    }

}
