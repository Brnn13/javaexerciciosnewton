import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva a base do retângulo");
        float base = sc.nextFloat();
        System.out.println("escreva a altura do retângulo");
        float altura = sc.nextFloat();
        float resultado = (base * altura) / 2f;
        System.out.println(resultado);
    }

}
