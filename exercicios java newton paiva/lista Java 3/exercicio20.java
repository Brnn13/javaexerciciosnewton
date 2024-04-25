import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva a nota 1");
        float n1 = sc.nextFloat();
        System.out.println("escreva a nota 2");
        float n2 = sc.nextFloat();
        float r1 = (n1 + n2) / 2;
        if (r1 >= 7f) {
            System.out.println("Aprovado");
        } else {
            System.out.println("escreva a nota 3");
            float n3 = sc.nextFloat();
            float r2 = (r1 + n3) / 3f;
            if (r2 >= 7f) {
                System.out.println("Aprovado, nota fixa 6");
            } else {
                System.out.println("Reprovado");
            }
        }
    }

}
