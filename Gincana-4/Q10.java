import javax.swing.JOptionPane;
public class Q10 {
    public static void main(String[] args){
        
        String input = JOptionPane.showInputDialog("Digite um número real:");
        double numero = Double.parseDouble(input);
        double raiz = Math.sqrt(numero);
        String mensagem = String.format("A raiz quadrada aproximada de %.2f é: %.2f", numero, raiz);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
