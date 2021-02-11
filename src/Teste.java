import br.edu.ifrs.pw1.formas.Figura;
import br.edu.ifrs.pw1.lados.Quadrado;
import br.edu.ifrs.pw1.semlados.Circulo;
import br.edu.ifrs.pw1.util.Cor;

public class Teste {
    public static void main(String[] args) {
        //a) deve criar um vetor com 5 posições que aceita objetos das classes Figura, Quadrado e Círculo;
        Figura[] vetor = new Figura[5];
        //b) cada objeto criado deve usar um construtor diferente (um objeto é criado com o construtor
        //com parâmetros e o outro objeto com o sem parâmetros);
        Cor rgb = new Cor(5, 8, 9);
        vetor[0] = new Quadrado(rgb);
        vetor[1] = new Quadrado(rgb, (double) 5);
        vetor[2] = new Quadrado(rgb, (double) 10);
        vetor[3] = new Circulo(rgb);
        vetor[4] = new Circulo(rgb, (double) 8);

        //c) percorra esse vetor imprimindo o valor das áreas calculadas;
        for(Figura figura : vetor) {
            if(figura != null) {
                System.out.print(
                        "Area do objeto: " + figura.calculaArea()+"\n");
            }
        }

    }
}
