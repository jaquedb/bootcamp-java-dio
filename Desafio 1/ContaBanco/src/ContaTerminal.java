import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double saldo = 200.00;

        System.out.println("Informe o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();


        System.out.println("Informe a agencia: ");
        String agencia = sc.nextLine();


        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println(" Nome: " + nome + " - Numero: " + numero + " - Agencia: " + agencia + " - Saldo: " + saldo);

        sc.close();

        

        

    }



}
