import java.util.Scanner;
import java.lang.Math;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        float x = scanner.nextFloat();
        double r1 = (Math.pow(x, 3f)) + 5f * (Math.pow(x, 7f)) + 2f * (Math.pow(x, 9f));
        double r2 = Math.sin(x) / x;
        double r3 = Math.pow(1 + (1 / x), x);
        double ln = Math.log(Math.abs(x) + 1);
        double log2 = Math.log(Math.abs(x) + 1) / Math.log(2);
        double r4 = Math.sqrt(ln + log2);
        double arcsin = Math.asin(x);
        double arccos = Math.acos(x);
        double r5 = arcsin + arccos;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}