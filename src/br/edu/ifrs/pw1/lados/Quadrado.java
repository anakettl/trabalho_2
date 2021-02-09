package br.edu.ifrs.pw1.lados;

import br.edu.ifrs.pw1.formas.Figura;

//Essa classe não pode possuir subclasses
public final class Quadrado extends Figura {
    protected Double lado;

    public Quadrado() {
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public double calculaArea(double lado) {
        double area;
        area = lado * lado;
        return area;
    };

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
