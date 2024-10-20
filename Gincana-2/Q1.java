// 1. Elabore um código que leia o valor do salário-mínimo e o valor do salário de
// um usuário, calcule a quantidade de salários-mínimos esse usuário ganha e
// imprima o resultado

import javax.swing.JOptionPane;

public class Q1 {
    public static void main(String[] args) {
        Double salarioMinimo, salarioUsuario, salario;
        String saida;

        salarioMinimo= Double.parseDouble(JOptionPane.showInputDialog("Digite o salario minimo: "));
        salarioUsuario= Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: "));

        salario= salarioUsuario/salarioMinimo;

        saida= String.format("O valor do seu salario é %.2f salario minimos", salario);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);

    }
    
}
