package br.com.abc.javacore.Kenum.classes;


public enum TipoCliente {
    PESSOA_FISICA(1), PESSOA_JURIDICA(2){
        public String getId(){

            return "B";
        }
    };

    private int tipo;

    TipoCliente(int tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return "A";
    }

    public int getTipo() {
        return tipo;
    }
}

