import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numeros = 4;
        for (int i = 1; i <= numeros; i++) {
            System.out.println("Digite o " + i + "° número:");
            soma += sc.nextInt();
        }
        System.out.println("Resultado: " + soma);
    }

}
