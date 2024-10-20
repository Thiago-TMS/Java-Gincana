import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        int A;
        String input;
        input = JOptionPane.showInputDialog(null, "Digite um número:");
        try {
            A = Integer.parseInt(input);
            if (A >= 0) {
                StringBuilder sequencia = new StringBuilder();
                long resultado= 1;
                sequencia.append(A);
                for (int i = A; i > 1; i--) {
                    sequencia.append("x").append(i-1);
                    resultado *=i;
                }
                resultado*=A;
                sequencia.append(" = ").append(resultado);
                JOptionPane.showMessageDialog(null, sequencia.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número maior que zero.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
        }
    }
}
