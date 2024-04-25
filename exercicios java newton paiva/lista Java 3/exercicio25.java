import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro time:");
        String time1 = scanner.nextLine();
        System.out.println("Digite o número de gols marcados:");
        int golsTime1 = scanner.nextInt();
        System.out.println("Digite o nome do segundo time:");
        scanner.nextLine();
        String time2 = scanner.nextLine();
        System.out.println("Digite o número de gols marcados:");
        int golsTime2 = scanner.nextInt();
        String vencedor;
        if (golsTime1 > golsTime2) {
            vencedor = time1;
        } else if (golsTime2 > golsTime1) {
            vencedor = time2;
        } else {
            vencedor = "EMPATE";
        }
        System.out.println("O vencedor é: " + vencedor);
    }
}