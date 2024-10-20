// 7. O custo de um carro novo ao consumidor é a soma do custo de fábrica com
// a porcentagem do distribuidor e dos impostos (aplicados ao custo de
// fábrica). Supondo que o percentual do distribuidor seja de 28% e os
// impostos de 45%, elabore um código para ler o custo de fábrica de um carro,
// calcular e escrever o custo final ao consumidor

 import javax.swing.JOptionPane;

 public class Q7 {

     public static void main(String[] args) {
         try {
             // Solicitar o custo de fábrica do carro ao usuário
             String custoFabricaInput = JOptionPane.showInputDialog(null, "Digite o custo de fábrica do carro:");

             double custoFabrica = Double.parseDouble(custoFabricaInput);

             double percentualDistribuidor = 0.28; // 28%
             double percentualImpostos = 0.45; // 45%

             double valorDistribuidor = custoFabrica * percentualDistribuidor;
             double valorImpostos = custoFabrica * percentualImpostos;

             double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

             JOptionPane.showMessageDialog(null, String.format("O custo final ao consumidor é: R$ %.2f", custoFinal));

         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.", "Erro", JOptionPane.ERROR_MESSAGE);
         }
     }
 }
