import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu login: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        int senha = scanner.nextInt();

    if (nome == "admin" && senha == 1234) {
     System.out.println("Login Bem-Sucedido");
    } else {
     System.out.println("Login inválido. Conta bloqueada.");
    }
   }
  }

