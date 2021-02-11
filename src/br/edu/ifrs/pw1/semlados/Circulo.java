package br.edu.ifrs.pw1.semlados;

import br.edu.ifrs.pw1.formas.Figura;
import br.edu.ifrs.pw1.util.Cor;

public class Circulo extends Figura {
    private double raio;
    //constante e variavel de classe
    public static final double PI = 3.1415;

    //d) imprima o valor do contador sempre que um objeto for criado;
    public Circulo(Cor cor) {
        super(cor);
        contador++;
        System.out.println("Contador de objetos criados: " + getContador());
    }

    public Circulo(Cor cor, double raio) {
        super(cor);
        this.raio = raio;
        contador++;
        System.out.println("Contador de objetos criados: " + getContador());
    }

    public double calculaArea() {
        double area;
        area = PI * (raio * raio);
        return area;
    };
}
