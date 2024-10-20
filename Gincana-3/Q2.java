
import javax.swing.JOptionPane;

// 2. Elabore um código para ler o preço de 10 produtos diferentes. Apresente o
// valor do produto mais barato e mais caro. Valide a entrada dos valores
// digitados.

public class Q2 {
    public static void main(String[] args) {
        int i=0;
        Double produto, barato=Double.MAX_VALUE, caro=Double.MIN_VALUE;
        String saida, saida2;

        while (i<10) {
            produto= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));

            if (produto<barato) {
                barato=produto;
            }if (produto>caro) {
                caro=produto;
            }

            i++;
        }

        saida= String.format("O produto mais barato é o de valor R$%.2f ", barato);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);

        saida2= String.format("O produto mais caro é o de valor R$%.2f2", caro);
        JOptionPane.showMessageDialog(null, saida2);
        System.out.println(saida2);
    }
}
