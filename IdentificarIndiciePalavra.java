import java.util.Scanner;

public class IdentificarIndiciePalavra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase ");
        String texto = scan.nextLine();



        System.out.println("Digite uma palavra do frase");
        String palavraTexto = scan.nextLine();
        
        int indicePalavra = texto.indexOf(palavraTexto);

        System.out.println("O índice da palavra é " + indicePalavra);



        scan.close();
    }
}
