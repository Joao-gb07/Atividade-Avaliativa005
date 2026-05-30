import java.util.Scanner;

public class VerificarAnagramas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite uma palavra ");
        String palavra1 = scan.nextLine();

        System.out.println("digite outra palavra ");
        String palavra2 = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(palavra2);

        if (palavra1.equalsIgnoreCase(sb.reverse().toString())){
            System.out.println("É Anagrama");
        }
        else {
            System.out.println("Não é Anagrama");
        }

        scan.close();
    }
}
