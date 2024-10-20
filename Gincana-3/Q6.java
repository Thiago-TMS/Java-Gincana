// 6. Elabore um código que armazene um horário (hora, minuto e segundo) em
// variáveis, depois, determine e exiba a quantidade de segundos que se
// passaram desde as 0h00min0s e a quantidade de segundos que faltam para
// a meia-noite


 import javax.swing.JOptionPane;

 public class Q6 {

     public static void main(String[] args) {
         try {
             String horaInput = JOptionPane.showInputDialog(null, "Digite a hora (0-23):");
             String minutoInput = JOptionPane.showInputDialog(null, "Digite os minutos (0-59):");
             String segundoInput = JOptionPane.showInputDialog(null, "Digite os segundos (0-59):");

             int hora = Integer.parseInt(horaInput);
             int minuto = Integer.parseInt(minutoInput);
             int segundo = Integer.parseInt(segundoInput);
             if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
                 JOptionPane.showMessageDialog(null, "Por favor, insira um horário válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                 return;
             }

             int segundosPassados = hora * 3600 + minuto * 60 + segundo;
             int totalSegundosDia = 24 * 3600;
             int segundosRestantes = totalSegundosDia - segundosPassados;

             JOptionPane.showMessageDialog(null, "Segundos passados desde 0h00min0s: " + segundosPassados
                                             + "\nSegundos restantes para a meia-noite: " + segundosRestantes);

         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
         }
     }
 }
