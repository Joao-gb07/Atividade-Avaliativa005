import java.util.Scanner;

public class SusbstituirPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        String trocar = frase.replaceAll("[aeiouAEIOU]", "X");

        System.out.println("A nova frase é: " + trocar);



        scan.close();
    }
    
}
