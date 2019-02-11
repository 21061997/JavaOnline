package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.ArquivoDAOImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        ArquivoDAOImpl arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("Nome1");
        lista.add("Nome2");
        lista.add("Nome3");
        lista.add("Nome4");
        lista.add("Nome5");
        lista.add("Nome6");
        lista.add("Nome7");
        lista.add("Nome8");
        lista.add("Nome9");


        for (String listando : lista) {
            System.out.println(listando);
        }




    }
}




