import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soma = 0;
        int numeros = 3;
        for (int i = 1; i <= numeros; i++) {
            System.out.println("Digite a " + i + "ª nota:");
            soma += sc.nextFloat();
        }
        System.out.println("Resultado: " + soma / 3);
    }

}