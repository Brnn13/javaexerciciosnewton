import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a descrição do produto:");
        String descricao = scanner.nextLine();
        System.out.println("Digite a quantidade adquirida:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o preço unitário:");
        double precoUnitario = scanner.nextDouble();
        double total = quantidade * precoUnitario;
        double desconto;
        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }
        double totalPagar = total - desconto;
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + totalPagar);
        System.out.println("Descrição: " + descricao);
    }
}
