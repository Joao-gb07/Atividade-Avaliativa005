import java.util.Scanner;

public class ReceberDuasPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra1 = scan.nextLine();

        System.out.println("Digite outra palavra");
        String palavra2 = scan.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais");
        } 
        else {
            System.out.println("As palavras não são iguais");

            if (palavra1.length() > palavra2.length()) {
                System.out.println("A primeira palavra é maior que a segunda");
            }
            else {
                System.out.println("A segunda palavra é maior que a primeira");
            }
            
        }
    
        scan.close();
    }
}
