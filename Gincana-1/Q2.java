// 2. Elabore um código que imprima a média aritmética dos números 8,9 e 7.

package Gincana.GincanaUm;

import javax.swing.JOptionPane;

public class Q2 {
    public static void main(String[] args) {
      
        int cal;
        String saida;

        cal= (8+9+19)/3;

        saida=String.format("A média é %d", cal);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);
    }



    



}
