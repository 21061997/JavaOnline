package br.com.abc.javacore.Minterfaces.test;

import br.com.abc.javacore.Minterfaces.classes.Produto;

public class TestProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 4, 3000);
        produto.calcularTributo();
        produto.calcularFrete();
        System.out.println(produto);



    }
}
