// 7. Elabore um código que solicita ao usuário informar o volume de uma caixa e
// o volume de um objeto, informando quantos objetos cabem dentro desta
// caixa.

package Gincana.GincanaUm;

import javax.swing.JOptionPane;

public class Q7 {
    public static void main(String[] args) {
        double volCx, volOb,quan;
        String saida;

        volCx= Double.parseDouble(JOptionPane.showInputDialog("Digite o volume da caixa: "));
        volOb= Double.parseDouble(JOptionPane.showInputDialog("Digite o volume do objeto: "));
        
        quan= volCx/volOb;

        saida= String.format("A quantidade de objetos que cabem dentro desta caixa é de %.2f", quan);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);
    }
}
