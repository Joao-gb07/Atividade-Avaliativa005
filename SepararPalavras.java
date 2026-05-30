import java.util.Scanner;

public class SepararPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        String[] separacao = frase.trim().split("\\s+"); 

        System.out.println();
        
        for (String palavra : separacao) {
            System.out.println(palavra);
        }

        scan.close();
    }
}
