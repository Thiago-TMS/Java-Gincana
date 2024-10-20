import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] c = new int[8];
        int ultimaPosicaoNegativa = -9;
        for (int i = 0; i < 8; i++){
            System.out.println("Digite 8 números :");
            c[i] = scanner.nextInt();
            if (c[i] < 0) {
                ultimaPosicaoNegativa = i;
    }
    }
    if (ultimaPosicaoNegativa != -9) {
        System.out.println("A posição do último número negativo é: " + ultimaPosicaoNegativa);
    } else {
        System.out.println("Nenhum número negativo foi digitado.");
    }
}
}