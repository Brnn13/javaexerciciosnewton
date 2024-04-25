import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        float salario = sc.nextFloat();
        System.out.println("Digite seu aumento em decimal: ");
        float aumento = sc.nextFloat();
        float salario2 = salario * aumento;
        float resultado = salario + salario2;
        System.out.println("Resultado: R$ " + resultado);
    }

}
