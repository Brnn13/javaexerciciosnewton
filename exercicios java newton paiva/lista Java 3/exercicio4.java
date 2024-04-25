import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva a 1ª nota");
        float nota1 = sc.nextFloat();
        System.out.println("escreva a 2ª nota");
        float nota2 = sc.nextFloat();
        System.out.println("escreva a 3ª nota");
        float nota3 = sc.nextFloat();
        float media = (nota1 * 2f + nota2 * 3f + nota3 * 5f) / (2f + 3f + 5f);
        System.out.println("Média: " + media);
    }

}
