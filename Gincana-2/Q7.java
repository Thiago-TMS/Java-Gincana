
import javax.swing.JOptionPane;

// 7. Elabore um código que calcule a área de um losango, a partir de suas
// diagonais

public class Q7 {
    public static void main(String[] args) {
        Double diago1, diago2, area;
        String saida;

        diago1= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal maior: "));
        diago2= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal menor: "));

        area= diago1*diago2 /2;

        saida= String.format("O valor da area é de %.2f", area);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);


    }
}
