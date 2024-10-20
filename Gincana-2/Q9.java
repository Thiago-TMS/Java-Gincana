// 9. Elabore um código que calcule o volume de um cubo, a partir de sua aresta.

import javax.swing.JOptionPane;

public class Q9 {
    public static void main(String[] args) {
        Double volume, aresta;
        String saida;

        aresta= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: ")); 

        volume= Math.pow(aresta, 2);

        saida= String.format("O valor do volume é de %.2f metro³", volume);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);
    }
}