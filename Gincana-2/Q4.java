import javax.swing.JOptionPane;

// 4. Elabore um código que armazene uma medida de raio em metros, determine
// e exiba o perímetro e a área de um círculo com esse raio.

public class Q4 {
    public static void main(String[] args) {
        Double raio, perimetro, area;
        String saida, saida2;
        raio=Double.parseDouble(JOptionPane.showInputDialog("Digite o raio em metros: "));

        perimetro= 2* Math.PI*raio;
        area= Math.PI*(raio*raio);

        saida= String.format("O valor do perimetro é de %.2f metros", perimetro);
        JOptionPane.showMessageDialog(null, saida);
        System.out.println(saida);
        
        saida2= String.format("O valor da area é de %.2f metros²", area);
        JOptionPane.showMessageDialog(null, saida2);
        System.out.println(saida2);

    }
}
