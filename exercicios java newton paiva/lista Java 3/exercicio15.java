import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva o numero de maçãs");
        int maca = sc.nextInt();
        if (maca >= 12) {
            System.out.println("Valor: R$ " + maca * 1.0);
        } else {
            System.out.println("Valor: R$ " + maca * 1.3);
        }
    }

}
