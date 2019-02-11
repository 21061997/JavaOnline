package br.com.abc.javacore.Oexception.runtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {

        Object o = new Object();

/*
        int a = 10;
        int b = 0;
        if (b != 0) {
            int c = a / b;

            System.out.println(c);
        } else {
            System.out.println("Divisão por zero não é correta");
        }
*/      try{

            int[] a = new int[2];
            System.out.println(a[2] );
            System.out.println("imprimindo depois da exeção");
        }catch (Exception e){
            e.printStackTrace();

        }
        System.out.println("Bloco catch");
    }
}
