package br.com.abc.indroducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {

        int[] nuremos = new int[5];
        int[] nuremos2 = new int[]{1, 2, 3, 4, 5};
        int[] nuremos3 = {1, 2, 3, 4, 5};

        nuremos[0] = 19;
        nuremos[1] = 18;
        nuremos[2] = 17;
        nuremos[3] = 16;
        nuremos[4] = 15;

        System.out.println("For normal");

        for (int i = 0; i < nuremos.length; i++) {
            System.out.println(nuremos[i]);
        }

        System.out.println("Foreach");
        for (int numeroAgurdaVaor : nuremos) {

            System.out.println(numeroAgurdaVaor);

        }


    }
}
