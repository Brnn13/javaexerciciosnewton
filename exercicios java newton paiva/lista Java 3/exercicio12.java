import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva o custo de fábrica");
        float base = sc.nextFloat();
        float resultado = base + (base * 0.28f) + (base * 0.45f);
        System.out.println(resultado);
    }

}
