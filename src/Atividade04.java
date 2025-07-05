import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 á 100: ");
        int nota = scanner.nextInt();

        if ((nota >= 90) && (nota <= 100)) {
            System.out.println("Sua nota é A");

        } else if ((nota >= 80) && (nota <= 89)) {
            System.out.println("Sua nota é B");

        } else if ((nota >= 70) && (nota <= 79)) {
            System.out.println("Sua nota é C");

        } else if ((nota >= 60) && (nota <= 69)) {
            System.out.println("Sua nota é D");

        } else if (nota < 60) {
            System.out.println("Sua nota é F");

        }
    }
}
