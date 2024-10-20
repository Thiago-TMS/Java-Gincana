
import javax.swing.JOptionPane;

// 4. Elabore um código que leia um número que é um código de usuário. Caso
// este código seja diferente de um código armazenado internamente no
// algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário
// inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha.
// Se esta senha estiver incorreta (a correta é 9999) deve ser mostrada a
// mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser
// mostrada a mensagem ‘Acesso permitido’.

public class Q4 {
    public static void main(String[] args) {
        int codigo= 1234, senha=9999, codigoUsu, senhaUsu;
        String saida1, saida2;

        codigoUsu= Integer.parseInt(JOptionPane.showInputDialog("Digite o código:"));
        while (codigoUsu!= codigo) { 
                saida1= String.format("Usuário invalido");
                JOptionPane.showMessageDialog(null, saida1);
                System.out.println(saida1);
            codigoUsu= Integer.parseInt(JOptionPane.showInputDialog("Digite o código:"));
            if (codigoUsu==codigo) {
                saida2= String.format("Usuario correto");
                JOptionPane.showMessageDialog(null, saida2);
                System.out.println(saida2);
            }
        }
        senhaUsu= Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));
        while (senhaUsu!= senha) { 
            saida1= String.format("Senha incorreta");
            JOptionPane.showMessageDialog(null, saida1);
            System.out.println(saida1);
            senhaUsu= Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));
        if (codigoUsu==codigo) {
            saida2= String.format("Acesso permitido");
            JOptionPane.showMessageDialog(null, saida2);
            System.out.println(saida2);
        }
    }
             
    }
        
    }
