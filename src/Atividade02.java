import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual valor deseja pegar emprestado? ");
        double valor = scanner.nextDouble();

        System.out.println("Em quantas parcelas deseja pagar? ");
        int parcelas = scanner.nextInt();

        System.out.println("Qual seu salário mensal? ");
        double salario = scanner.nextDouble();

        if (parcelas < 1) {
            System.out.println("Empréstimo reprovado. Número de parcelas inválido.");
        } else if (parcelas > 24) {
            System.out.println("Empréstimo reprovado. Número de parcelas inválido.");
        }

        double valorParcelas = (valor / parcelas);

        if (salario < valorParcelas) {
            System.out.println("Empréstimo reprovado. Parcela muito alta.");
        } else {
            System.out.println("Empréstimo aprovado. Valor de cada parcela: R$ " + valorParcelas);
        }
     }
 }
