import javax.swing.JOptionPane;

public class Q4 {
    public static void main(String[] args) {
        int N;
        String input;
        input = JOptionPane.showInputDialog(null, "Digite um número:");

        try {
            N = Integer.parseInt(input);
            if (N >= 1 && N <= 10) {
                StringBuilder tabuada = new StringBuilder();
                for (int i = 0; i <= 10; i++) {
                    tabuada.append(i).append(" x ").append(N).append(" = ").append(i * N).append("\n");
                }
                JOptionPane.showMessageDialog(null, tabuada.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número entre 1 e 10.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
        }
    }
}

 