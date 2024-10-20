// 5. Elabore um código que solicita ao usuário digitar um número, e indique se
// esse número é par ou ímpar

package Gincana.GincanaUm;

import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        int num;
        String saida;

        num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    

        if (num %2==0) {
            saida=String.format("O número digitado é par");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
        }else{
            saida=String.format("O número digitado é impar");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
        }
    }
}
