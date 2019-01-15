public class ControleDeFluxo4 {
    public static void main(String[] args) {

        int contador = 0;

        System.out.println("Primeiro laço Usando Do While");
        do {
            System.out.println(contador);
            ++contador;
            if (contador == 5) {
                break;
            }

        } while (contador < 10);


        System.out.println("Segundo Laço Usando For");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }


        }


        int contador2 = 0;
        System.out.println("Terceiro laço Usando While");
        while (contador2 < 10) {
            System.out.println(contador2);
            contador2++;
            if (contador2 == 5) {
                break;
            }

        }


    }


}
