import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o próximo valor inteiro:");
            valores.add(scanner.nextInt());
        }
        Collections.sort(valores);
        System.out.println(
                "Os valores em ordem crescente são: " + valores.get(0) + ", " + valores.get(1) + ", " + valores.get(2));
    }
}
