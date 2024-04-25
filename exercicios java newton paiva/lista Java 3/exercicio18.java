import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor inteiro:");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor inteiro:");
        int valor2 = scanner.nextInt();
        System.out.println("Escolha uma operação:");
        System.out.println(
                "1. Soma\n2. Diferença\n3. Produto\n4. Divisão\n5. Resto da divisão\n6. Potência\n7. Raiz quadrada");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Soma: " + (valor1 + valor2));
                break;
            case 2:
                System.out.println("Diferença: " + (valor1 - valor2));
                break;
            case 3:
                System.out.println("Produto: " + (valor1 * valor2));
                break;
            case 4:
                if (valor2 != 0) {
                    System.out.println("Divisão: " + ((double) valor1 / valor2));
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            case 5:
                System.out.println("Resto da divisão: " + (valor1 % valor2));
                break;
            case 6:
                System.out.println("Potência: " + Math.pow(valor1, valor2));
                break;
            case 7:
                System.out.println("Raiz quadrada do primeiro valor: " + Math.sqrt(valor1));
                System.out.println("Raiz quadrada do segundo valor: " + Math.sqrt(valor2));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}