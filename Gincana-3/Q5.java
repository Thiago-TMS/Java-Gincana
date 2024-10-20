
// 5. Elabore um código que determine e escreva os números primos compreendidos entre um intervalo fornecido pelo usuário




import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial do intervalo:"));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final do intervalo:"));

        StringBuilder primos = new StringBuilder("Números primos no intervalo [" + inicio + ", " + fim + "]:\n");
        
        for (int i = inicio; i <= fim; i++) {
            if (ePrimo(i)) {
                primos.append(i).append(" ");
            }
        }

        JOptionPane.showMessageDialog(null, primos.toString());
    }

    public static boolean ePrimo(int numero) {
        if (numero < 2) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
