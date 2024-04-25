import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva a quantidade de segundos");
        float seg = sc.nextFloat();
        float min = (seg / 60f);
        float hor = (min / 60f);
        System.out.println(hor + ", " + min + ", " + seg);
    }

}