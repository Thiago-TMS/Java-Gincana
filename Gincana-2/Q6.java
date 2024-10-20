
import javax.swing.JOptionPane;

// 6. Elabore um código que calcule a área de um trapézio, a partir de suas bases
// maior e menor e de sua altura.

public class Q6 {
    public static void main(String[] args) {
        Double Base, base, altura, area;
        String saida;

        Base= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base maior:"));
        base=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base menor:"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura:"));

        area= (Base+base)*altura /2;

        saida= String.format("O valor da area é de %.2f", area);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);

    }
}
