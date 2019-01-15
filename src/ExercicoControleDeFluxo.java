public class ExercicoControleDeFluxo {

    public static void main(String[] args) {
        double salario = 1000;
        double totalImposto = 0;

        if (salario <= 1000) {
            System.out.println("Entrou no primeiro if");
            totalImposto = salario * 0.05;

        } else if (salario >= 1000 && salario < 2000) {
            System.out.println("Entrou no segundo if");
            totalImposto = salario * 0.1;
        } else if (salario >= 2000 && salario < 4000) {

            System.out.println("Entrou no terceiro if");
            totalImposto = salario * 0.15;

        } else {

            System.out.println("Entrou no quarto if");
            totalImposto = salario * 0.20;

        }

        System.out.println(totalImposto);


    }


}
