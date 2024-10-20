import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {
        double[] alturas = new double[15];
       
        for (int i = 0; i < 15; i++) {
        String entrada = JOptionPane.showInputDialog("Digite a altura da pessoa " + (i + 1) + " (em metros):");
         alturas[i] = Double.parseDouble(entrada);
        }
      
        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
      if (alturas[i] < menorAltura) {
         menorAltura = alturas[i];
          }
       if (alturas[i] > maiorAltura) {
          maiorAltura = alturas[i];
      }
        }

      String resultado = "Menor altura do grupo: " + menorAltura + " m\n" +
                           "Maior altura do grupo: " + maiorAltura + " m";
      JOptionPane.showMessageDialog(null, resultado);
    }
}
