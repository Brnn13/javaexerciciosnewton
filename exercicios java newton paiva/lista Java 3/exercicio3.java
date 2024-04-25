import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva a temp em Fahrenheit");
        float f = sc.nextFloat();
        float resultado = (f - 32) * (5.0f / 9.0f);
        System.out.println(resultado + "°C");
    }
}