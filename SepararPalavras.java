import java.util.Scanner;

public class SepararPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        String[] separacao = frase.split(" "); 
        

        System.out.println("As palavras da frase são: " + separacao);


        scan.next();
    }
}
