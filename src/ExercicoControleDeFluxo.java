public class ExercicoControleDeFluxo {

    public static void main(String[] args) {
        double salario = 2000;

        if (salario < 1000) {

            salario = salario + (salario * 0.05);
            System.out.println(salario);

        } else if (salario >= 1000 && salario < 2000) {
            salario = salario + (salario * 0.1);
            System.out.println(salario);
        } else if (salario >= 2000 && salario < 4000) {

            salario = salario + (salario * 0.15);
            System.out.println(salario);

        } else {
            salario = salario + (salario * 0.20);
            System.out.println(salario);

        }


    }


}
