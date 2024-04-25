import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];
        System.out.println("Digite cinco valores inteiros:");
        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextInt();
        }
        int maior = valores[0];
        int menor = valores[0];
        for (int i = 1; i < 5; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}
