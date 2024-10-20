// 8. Elabore um código que calcule a média harmônica de três números
// digitados pelo usuário


 import javax.swing.JOptionPane;

 public class Q8 {

     public static void main(String[] args) {
         try {

             String num1Input = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
             String num2Input = JOptionPane.showInputDialog(null, "Digite o segundo número:");
             String num3Input = JOptionPane.showInputDialog(null, "Digite o terceiro número:");

             double num1 = Double.parseDouble(num1Input);
             double num2 = Double.parseDouble(num2Input);
             double num3 = Double.parseDouble(num3Input);

             if (num1 == 0 || num2 == 0 || num3 == 0) {
                 JOptionPane.showMessageDialog(null, "Os números não podem ser zero para o cálculo da média harmônica.", "Erro", JOptionPane.ERROR_MESSAGE);
                 return;
             }

             double mediaHarmonica = 3 / ((1 / num1) + (1 / num2) + (1 / num3));

             JOptionPane.showMessageDialog(null, String.format("A média harmônica é: %.2f", mediaHarmonica));

         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
         }
     }
 }
