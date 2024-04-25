import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva seu ano");
        int ano = sc.nextInt();
        System.out.println("escreva o numero do seu mês");
        int mes = sc.nextInt();
        System.out.println("escreva o dia");
        int dia = sc.nextInt();
        int idade = ((2023 - ano) * 365);
        System.out.println("Idade: " + dia + "/" + mes + "/" + ano + "; " + idade + " dias");
    }

}
