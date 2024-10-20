// 8. Elabore um código que calcule o volume de uma esfera, a partir de seu raio.

import javax.swing.JOptionPane; 
public class Q8 {
    public static void main(String[] args) {
        Double raio, volume;
        String saida;

        raio= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: ")); 

        volume= (4.0/3.0)*Math.PI*Math.pow(raio, 3);

        saida= String.format("O valor do volume é de %.2f metro³", volume);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);

    }
}
