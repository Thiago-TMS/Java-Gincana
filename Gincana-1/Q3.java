// 3. Elabore um código que peça ao usuário a digitação de um saldo e imprimir
// o saldo com reajuste de 1%

package Gincana.GincanaUm;

import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {
        Double salario, reajuste;
        String saida;

        salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário:"));

        reajuste= salario *0.01 + (salario);

        saida= String.format("O seu salário reajustado é de %.2f", reajuste);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);

    }
}
