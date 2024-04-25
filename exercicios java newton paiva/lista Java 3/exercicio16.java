import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de x:");
        double x = scanner.nextDouble();
        System.out.println("Digite o valor de y:");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("O par ordenado (" + x + ", " + y + ") está no primeiro quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("O par ordenado (" + x + ", " + y + ") está no segundo quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("O par ordenado (" + x + ", " + y + ") está no terceiro quadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("O par ordenado (" + x + ", " + y + ") está no quarto quadrante.");
        } else {
            System.out.println("O par ordenado (" + x + ", " + y + ") está na origem.");
        }
    }
}
