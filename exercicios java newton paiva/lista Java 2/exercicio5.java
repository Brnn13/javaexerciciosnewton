import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário base: ");
        float salario = sc.nextFloat();
        float conta = ((salario * 0.5f) + (salario * -0.7f));
        float Resultado = (salario + conta);
        System.out.println("Resultado: R$ " + Resultado);
    }
}