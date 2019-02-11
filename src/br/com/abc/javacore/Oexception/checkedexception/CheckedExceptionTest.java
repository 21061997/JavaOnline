package br.com.abc.javacore.Oexception.checkedexception;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {

        criarArquivo();
    }

    public static void criarArquivo() {
        File file = new File("teste.txt");
        try { // Tente fazer o solicitado, caso não consiga execute o catch

            file.createNewFile();
            System.out.println("Arquivo criado com sucesso");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
