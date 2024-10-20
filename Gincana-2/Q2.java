
import javax.swing.JOptionPane;

// 2. Elabore um código que solicita ao usuário que digite um número e verifique
// se o número é positivo. Se o número for positivo, exiba a mensagem "O
// número é positivo". Caso contrário, exiba a mensagem "O número é
// negativo".

public class Q2 {
    public static void main(String[] args) {
        Double num1;
        String saida;

        num1= Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));

        if (num1>0) {
            saida= String.format("O número digitado é positivo");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
        }else{
            saida= String.format("O número digitado é negativo");
            JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
        }
    }
}
