import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Negativo:");
        }
        if (x > 0) {
            System.out.println("Positivo:");
        } else {
            System.out.println("Zero");
        }
    }
}
