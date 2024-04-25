import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva o numero de aulas do professor 1");
        float h1 = sc.nextFloat();
        System.out.println("escreva o numero de aulas do professor 2");
        float h2 = sc.nextFloat();
        float r1 = h1 * 10f;
        float r2 = h2 * 15f;
        System.out.println("O professor 1 ganhou R$ " + r1 + "; O professor 2 ganhou R$ " + r2);
    }

}
