// 10. Elabore um código que solicita ao usuário um número inteiro, e verifique se
// o número é múltiplo de 7, informando na tela caso positivo.

package Gincana.GincanaUm;

import javax.swing.JOptionPane;

public class Q10 {

    public static void main(String[] args) {
                int num;
        String saida;

        num= Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

        if (num %7==0) {
            saida= String.format("Positivo");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
        }else {
            saida= String.format("Negativo");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);   
        }
    }
}
