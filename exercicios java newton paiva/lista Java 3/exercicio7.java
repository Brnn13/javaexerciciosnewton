import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um caractere:");
        char caractere = scanner.next().charAt(0);
        int codigoCaractere = (int) caractere;
        int antecessorASCII = codigoCaractere - 1;
        int sucessorASCII = codigoCaractere + 1;
        System.out.println("Antecessor na tabela ASCII: " + (char) antecessorASCII);
        System.out.println("Sucessor na tabela ASCII: " + (char) sucessorASCII);
    }
}
