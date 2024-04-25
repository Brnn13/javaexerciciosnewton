import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        float salario = sc.nextFloat();
        salario *= 1.25;
        System.out.println("Resultado: R$ " + salario);
    }

}
