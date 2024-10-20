
import javax.swing.JOptionPane;

// 3. Elabore um código que armazene 10 números digitados pelo usuário em um
// vetor. Após, exiba os valores dos números pares e ímpares separadamente.

public class Q3 {
    public static void main(String[] args) {
        // Criação de strings para acumular os números
        String pares = "Números pares: ";
        String impares = "Números ímpares: ";

        // Loop para ler 10 números
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

            // Se for par, adiciona à string de pares
            if (num % 2 == 0) {
                pares += num + " ";  // Acumula o número par
            } else {
                impares += num + " ";  // Acumula o número ímpar
            }
        }

        // Exibe os números acumulados no final
        JOptionPane.showMessageDialog(null, pares);
        JOptionPane.showMessageDialog(null, impares);
    }
}


