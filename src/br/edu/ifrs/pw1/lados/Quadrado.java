package br.edu.ifrs.pw1.lados;

import br.edu.ifrs.pw1.formas.Figura;
import br.edu.ifrs.pw1.util.Cor;

//Essa classe não pode possuir subclasses
public final class Quadrado extends Figura {
    protected Double lado;

    //d) imprima o valor do contador sempre que um objeto for criado;
    public Quadrado(Cor cor) {
        super(cor);
        contador++;
        System.out.println("Contador de objetos criados: " + getContador());
    };

    public Quadrado(Cor cor, Double lado) {
        super(cor);
        contador++;
        System.out.println("Contador de objetos criados: " + getContador());
        this.lado = lado;
    }

    public double calculaArea() {
        double area;
        if (this.lado ==null) {
            lado = (double)0;
        } else {
            lado = this.lado;
        }
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
