import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número total de eleitores:");
        int totalEleitores = scanner.nextInt();
        System.out.println("Digite o número de votos brancos:");
        int brancos = scanner.nextInt();
        System.out.println("Digite o número de votos nulos:");
        int nulos = scanner.nextInt();
        System.out.println("Digite o número de votos válidos:");
        int validos = scanner.nextInt();

        double percentualBrancos = (double) brancos / totalEleitores * 100;
        double percentualNulos = (double) nulos / totalEleitores * 100;
        double percentualValidos = (double) validos / totalEleitores * 100;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
    }
}
