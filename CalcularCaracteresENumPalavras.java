import java.util.Scanner;

public class CalcularCaracteresENumPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra ou texto ");
        String texto = scan.nextLine();

        int QtdCaracteres = texto.length();

        System.out.println("A qtd de caracateres é " + QtdCaracteres);


        String [] palavras = texto.split(" ");
        int QtdPalavras = palavras.length;

        System.out.println("A qtd de palavras é " + QtdPalavras);

        scan.close();
    }
    
}