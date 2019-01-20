public class Arrays5 {
    public static void main(String[] args) {
        /*Array para verificar os dias do ano*/

        int[][] dias = new int[2][2];
        dias[0][0] = 20;
        dias[0][1] = 30;
        dias[1][0] = 20;
        dias[1][1] = 30;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("****************Foreach********************");
        for (int[] i: dias) {
            for (int k : i) {
                System.out.println(k);

            }
        }


    }
}
