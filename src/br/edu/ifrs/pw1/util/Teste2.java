package br.edu.ifrs.pw1.util;

import br.edu.ifrs.pw1.formas.Figura;
import br.edu.ifrs.pw1.lados.Quadrado;
import br.edu.ifrs.pw1.semlados.Circulo;

// e) crie a classe de testes no pacote br.edu.ifrs.pw1.util;
public class Teste2 {
    public static void main(String[] args) {
        Cor rgb = new Cor(5, 8, 9);
        Circulo[] vet = new Circulo[2];

        vet[0] = new Circulo(rgb);
        vet[1] = new Circulo(rgb, (double) 8);

        //f) Inclua as linhas abaixo na classe de teste e explique se funcionam ou não, justificando suas respostas.
        //funciona pois qualquer objeto do tipo figura pode acessar o metodo de classe getContador que é um metodo de classe
        System.out.println(vet[1].getContador());
        //a classe figura pode acessar o contador porém ele não será incrementado já que não esta sendo criado nenhum objeto
        System.out.println(Figura.getContador());
//        g) Inclua as linhas abaixo na classe de teste e explique se funcionam ou não, justificando suas
//        respostas. Cuidado com essa questão, porque ele só funcionará se o objeto que está na posição “i” do vetor for Circulo! Então, use o operador instanceof.
        //funciona pq pi é uma constante e variavel de classe, entao ela pode ser chamada tanto a partir de um objeto como a partir da classe
        if (vet[1] instanceof Circulo){
            System.out.println(vet[1].PI);
        }
        System.out.println(Circulo.PI);

    }
}


