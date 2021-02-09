//A classe Math possui vários métodos de classe com várias funcionalidades diferentes.
// Faça um programa que lê um número com casas decimais e utiliza os 3 métodos usados para arredondar números.
// Explique com suas palavras a diferença existente entre cada um desses métodos.
import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        float numero;
        numero = Float.parseFloat(JOptionPane.showInputDialog("Digite um número com casas decimais"));

        JOptionPane.showMessageDialog(null, "O numero digitado foi :" + numero
                                    + "\nEsse numero arredondado com round fica: " + Math.round(numero)
                                    + "\nEsse numero arredondado com ceil fica: " + Math.ceil(numero)
                                    + "\nEsse numero arredondado com floor fica: " + Math.floor(numero));

        System.exit(0);

        //O metodo round arredonda para cima e retorna um int
        //O metodo ceil arredonda para cima e retorna um double
        //O metodo floor arredonda para baixo e retorna um double

    }
}
