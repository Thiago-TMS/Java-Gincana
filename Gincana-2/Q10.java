// 10. Elabore um código que calcule o volume de um cilindro, a partir do raio de
// sua base e de sua altura.

import javax.swing.JOptionPane;

public class Q10 {
    public static void main(String[] args) {
        Double volume, raio, altura;
        String saida;

        raio= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: ")); 
        altura= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));

        volume= Math.PI * Math.pow(raio, 2)*altura;

        saida= String.format("O valor do volume é de %.2f metro³", volume);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);

    }
}
