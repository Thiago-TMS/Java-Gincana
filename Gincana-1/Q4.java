// 4. Elabore um código que leia um número inteiro e imprima o seu antecessor e
// seu sucessor

package Gincana.GincanaUm;

import javax.swing.JOptionPane;

public class Q4 {
    public static void main(String[] args) {
        int num1, depois, antes;
        String saida, saida2;

        num1= Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

        depois= num1+1;
        antes=num1-1;

        saida= String.format("O numero antecessor a este digitado é %d", antes);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);

        saida2= String.format("O numero sucessor a este digitado é %d", depois);
        JOptionPane.showMessageDialog(null, saida2);
        System.out.println(saida2);


        
    }
}
