package br.com.abc.javacore.Kenum.test;

import br.com.abc.javacore.Kenum.classes.Cliente;
import br.com.abc.javacore.Kenum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Yuri Vaz Dos Santos", TipoCliente.PESSOA_JURIDICA);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(cliente);

    }
}
