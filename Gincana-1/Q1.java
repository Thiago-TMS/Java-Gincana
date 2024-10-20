// 1. Elabore um código que leia a idade de uma pessoa expressa em anos, meses
// e dias e mostre-a expressa em dias. Leve em consideração o ano com 365
// dias e o mês com 30. (Ex: 3 anos, 2 meses e 10 dias = 1165 dias.)

package Gincana.GincanaUm;

import javax.swing.JOptionPane;

public class Q1 {
    public static void main(String[] args) {
        int idade, mes, dia, conver1, conver2, cal;
        String saida;

        idade= Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade : "));
        mes= Integer.parseInt(JOptionPane.showInputDialog("Digite os mêses: "));
        dia= Integer.parseInt(JOptionPane.showInputDialog("Digite os dias: "));

        conver1= idade*365;
        conver2= mes*30;
        cal= conver1+conver2+dia;

        saida= String.format("A sua idade é de %d dias", cal);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);
    }
}
