import java.util.Scanner;

public class Q8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] c = new int[15];
        for (int i = 0; i < 15; i++){
            System.out.println("Digite 15 números:");
            c[i] = scanner.nextInt();
        }
        System.out.println("\nValores digitados:");
        for (int i = 0; i < 15; i++) {
            System.out.print(c[i] + " ");
}
System.out.println("\n\nValores digitados na ordem inversa:");
for (int i = 14; i >= 0; i--) {
    System.out.print(c[i] + " ");
}
}
}