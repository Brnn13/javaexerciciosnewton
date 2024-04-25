import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva um número");
        int numero = sc.nextInt();
        System.out.println((numero - 1) + ", " + numero + ", " + (numero + 1));
    }

}
