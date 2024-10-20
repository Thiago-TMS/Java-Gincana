// 9. Elabore um código que calcule a média geométrica de quatro números
// digitados pelo usuário.

 import javax.swing.JOptionPane;

 public class Q9 {

     public static void main(String[] args) {
         try {

             String num1Input = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
             String num2Input = JOptionPane.showInputDialog(null, "Digite o segundo número:");
             String num3Input = JOptionPane.showInputDialog(null, "Digite o terceiro número:");
             String num4Input = JOptionPane.showInputDialog(null, "Digite o quarto número:");

             double num1 = Double.parseDouble(num1Input);
             double num2 = Double.parseDouble(num2Input);
             double num3 = Double.parseDouble(num3Input);
             double num4 = Double.parseDouble(num4Input);

             if (num1 < 0 || num2 < 0 || num3 < 0 || num4 < 0) {
                 JOptionPane.showMessageDialog(null, "Os números não podem ser negativos para o cálculo da média geométrica.", "Erro", JOptionPane.ERROR_MESSAGE);
                 return;
             }

             double mediaGeometrica = Math.pow(num1 * num2 * num3 * num4, 1.0 / 4.0);

             JOptionPane.showMessageDialog(null, String.format("A média geométrica é: %.2f", mediaGeometrica));

         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
         }
     }
 }
