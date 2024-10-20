// 6. Elabore um código que solicita ao usuário digitar a idade de três pessoas, e
// indicar qual das três é mais velha.

package Gincana.GincanaUm;

import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args) {
        int id, id2, id3;
        String saida;

        id=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira pessoa: "));
        id2= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda pessoa: "));
        id3=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da terceira pessoa: "));

        if (id>id2 && id>id3) {
            saida=String.format("A primeira pessoa é a mais velha dentre as outras 2");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
        }else if (id2>id && id2>id3) {
            saida=String.format("A segunda pessoa é a mais velha dentre as outras 2");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
        }else{
            saida=String.format("A terceira pessoa é a mais velha dentre as outras 2");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
        }
    }
}
