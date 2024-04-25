import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um caractere maiúsculo de A a Z:");
        char maiusculo = scanner.next().charAt(0);
        if (maiusculo >= 'A' && maiusculo <= 'Z') {
            char minusculo = (char) (maiusculo + ('a' - 'A'));
            System.out.println("O caractere minúsculo correspondente é: " + minusculo);
        }
    }
}
