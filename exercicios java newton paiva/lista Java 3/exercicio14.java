import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva um numero");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("Não é par");
        }
    }

}
