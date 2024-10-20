
import javax.swing.JOptionPane;

// 3. Elabore um código que solicite ao usuário que digite o valor de um produto
// e verifique se o valor é maior que R$ 50,00. Se o valor for maior que R$ 50,00,
// calcule o desconto de 10% sobre o valor e exiba o novo valor com desconto.
// Caso contrário, exiba a mensagem “Não há desconto para este produto".

public class Q3 {
    public static void main(String[] args) {
        Double produto,cal;
        String saida;

        produto= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));

        if (produto>50) {
            cal= produto*0.5;
            saida=String.format("O valor com o desconto é de %.2f", cal);
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);

        }else{
            saida=String.format("Não há desconto para este produto");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
        }
    }
}
