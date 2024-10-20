
import javax.swing.JOptionPane;

// 1. Elabore um código que leia a altura de 15 pessoas. Este programa deverá
// calcular e mostrar: (a) a menor altura do grupo; (b) a maior altura do grupo;

public class Q1 {
    public static void main(String[] args) {
        int i=0;
        Double altura = null, maior=Double.MIN_VALUE, menor=Double.MAX_VALUE;
        String saida, saida2;


        while (i<15) {
            altura= Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
            
            if (altura<menor) {
                menor=altura;
            }else if (altura>maior) {
                maior=altura;
            }
            i=i+1;
        }

        saida= String.format("A menor altura do grupo é %.2f", menor);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);

        saida2= String.format("A maior altura do grupo é %.2f", maior);
        JOptionPane.showMessageDialog(null, saida2);
        System.out.println(saida2);

    }
}
