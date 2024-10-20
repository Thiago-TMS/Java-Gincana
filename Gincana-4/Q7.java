import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] c = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite 10 números "+ (i + 1) +":");
            c[i] = scanner.nextInt();
            soma += c[i];
        }
        System.out.println("A soma dos valores é:" + soma);
    }
}