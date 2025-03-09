import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double saldo = 200.00;

        /*Obs. Na variável "numero" precisei fazer a conversão de nextLine para int
        pois ao colocar um Scanner do tipo inteiro (numero) antes de um Scanner 
        do tipo String (agencia), o programa apresenta um erro (pula uma etapa). 
        Para evitar esse erro, usar sempre nextLine em tudo e converter depois. 
        ou inserir sc.nextLine() depois de um int ou double que for seguido de uma String
        */

        System.out.println("Informe o número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());


        System.out.println("Informe a agencia: ");
        String agencia = sc.nextLine();


        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println(" Nome: " + nome + " - Numero: " + numero + " - Agencia: " + agencia + " - Saldo: " + saldo);

        sc.close();

        

        

    }



}
