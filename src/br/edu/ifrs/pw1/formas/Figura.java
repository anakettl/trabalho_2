package br.edu.ifrs.pw1.formas;

import br.edu.ifrs.pw1.util.Cor;

public abstract class Figura {
    //variavel de classe
    public static int contador = 0;
    //o atributo cor é declarado como private na classe figura
    private Cor cor;

    public Figura(){}

    public Figura(Cor cor) {
        this.cor = cor;
    }

    //metodo de classe
    public static int getContador() {
        return contador;
    }

    //Um método abstrato não possui implementação
    public abstract double calculaArea();

    @Override
    public String toString() {
        return "Figura{" +
                "cor=" + cor +
                '}';
    }
}
