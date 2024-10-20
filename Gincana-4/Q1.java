import javax.swing.JOptionPane;

public class Q1 {

    public static void main(String[] args) {
        
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado do triangulo: "));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado do triangulo: "));
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado do triangulo: "));

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            JOptionPane.showMessageDialog(null,"Os lados informados podem formar um triangulo!");

        } else {
            JOptionPane.showMessageDialog(null,"Os lados informados não podem formar um triangulo!");
        }


    }}
