// 10. Elabore um código que calcule o número de ‘0’s em uma sequência de 10
// algarismos de 0 a 9 digitados pelo usuário.

import javax.swing.JOptionPane;

public class Q10 {

    public static void main(String[] args) {
        try {
            String numerosInput = JOptionPane.showInputDialog(null, "Digite uma sequência de 10 algarismos (0-9):");

            if (numerosInput.length() != 10) {
                JOptionPane.showMessageDialog(null, "Por favor, digite exatamente 10 algarismos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }


            int contadorZeros = 0;

            for (int i = 0; i < numerosInput.length(); i++) {
                char algarismo = numerosInput.charAt(i);

                if (!Character.isDigit(algarismo)) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira apenas algarismos (0-9).", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (algarismo == '0') {
                    contadorZeros++;
                }
            }

            JOptionPane.showMessageDialog(null, "O número de '0's na sequência é: " + contadorZeros);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
