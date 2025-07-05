import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        if (idade <= 6) {
            System.out.println("Valor a pagar: R$ 0,00");
            return;
        } else if (idade >= 65) {
            System.out.println("Valor a pagar: R$ 0,00");
            return;
        }

        System.out.println("Digite '1' se você é estudante, e '2' se não for");
        int estudante = scanner.nextInt();

        if (estudante == 1 && idade > 25) {
            System.out.println("Valor a pagar: R$ 4,00");
        }
        if (estudante == 1 && idade <= 25){
            System.out.println("Valor a pagar: R$ 2,00");
        }
        if (estudante == 2 && idade >= 6){
            System.out.println("Valor a pagar: R$ 4,00");

      } else if (estudante == 2 && idade < 65) {
            System.out.println("Valor a pagar: R$ 4,00");


     }
   }
 }

