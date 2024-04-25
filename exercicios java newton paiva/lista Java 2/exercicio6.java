import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soma = 0;
        int numeros = 4;
        for (int i = 1; i <= numeros; i++) {
            System.out.println("Digite o valor do " + i + "° produto:");
            soma += sc.nextFloat();
        }

        float desconto = 0;
        if (soma <= 100.00f) {
            System.out.println("Valor: R$ " + soma);
        }
        if (soma > 100f && soma < 200f) {
            desconto = 0.1f;
        }
        if (soma >= 200f && soma < 500f) {
            desconto = 0.15f;
        }
        if (soma >= 500f) {
            desconto = 0.25f;
        }

        if (desconto > 0) {
            float valor = soma - (soma * desconto);
            System.out.println("Valor: R$ " + valor);
        }
    }
}
