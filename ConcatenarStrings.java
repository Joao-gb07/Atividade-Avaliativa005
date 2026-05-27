import java.util.Scanner;

public class ConcatenarStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra1 = scan.nextLine();

        System.out.println("Digite uma palavra");
        String palavra2 = scan.nextLine();
        
        System.out.println("Digite uma palavra");
        String palavra3 = scan.nextLine();

        System.out.println("Digite uma palavra");
        String palavra4 = scan.nextLine();


        String palavraJuntas = palavra1.concat(" ").concat(palavra2).concat(" ").concat(palavra3).concat(" ").concat(palavra4);
        
        System.out.println(palavraJuntas);


        scan.close();
    }
}
