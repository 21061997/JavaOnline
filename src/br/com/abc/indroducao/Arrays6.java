package br.com.abc.indroducao;

public class Arrays6 {
    public static void main(String[] args) {

        int[][] dias = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int[]{1, 2, 3,};
        dias[2] = new int[4];

        dias[0][0] = 21;
        dias[0][1] = 22;

        dias[2][0] = 10;
        dias[2][1] = 11;
        dias[2][2] = 12;
        dias[2][3] = 13;

        int[][] numeros = {{0,0,0}, {0,0,0,0,0}, {0,0,0,0,0,0}};


        for (int[] contador : dias) {

            for (int dias_ : contador) {
                System.out.println(dias_);
            }
        }


    }
}
