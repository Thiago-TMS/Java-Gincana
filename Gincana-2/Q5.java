
import javax.swing.JOptionPane;

// 5. Elabore um código que calcule a área de um retângulo, a partir de sua base
// e sua altura.

public class Q5 {
    public static void main(String[] args) {
        Double base, altura, area;
        String saida;

        base= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
        altura= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));

        area= base*altura;

        saida= String.format("O valor da area é de %.2f", area);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);


    }
}
