import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args) {
        double soma = 0.0; 
        int contagem = 0;  
        while (soma < 100) {
            String input = JOptionPane.showInputDialog(null, "Digite um número real (ou cancele para encerrar):");
            if (input == null) {
                break; 
            }
            try {
                double numero = Double.parseDouble(input); 
                soma = soma + numero; 
                contagem++; 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número real válido."); 
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos números lidos é: " + soma + "\n" +
                                           "Foram necessários " + contagem + " valores.");
    }
}
