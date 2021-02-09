package br.edu.ifrs.pw1.semlados;

import br.edu.ifrs.pw1.formas.Figura;

public class Circulo extends Figura {
    private double raio;
    //constante e variavel de classe
    public static final double PI = 3.1415;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea(double raio) {
        double area;
        area = PI * (raio * raio);
        return area;
    };
}
