package br.edu.ifrs.pw1.util;

public class Cor {
    private int red;
    private int green;
    private int blue;

    public Cor() {}

    public Cor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "Cor{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
