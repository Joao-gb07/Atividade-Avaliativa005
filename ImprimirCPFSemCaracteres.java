import java.util.Scanner;

public class ImprimirCPFSemCaracteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu CPF (000.000.000-00)");
        String cpfString = scan.nextLine();

        String cpfSomenteNumeros = cpfString.replaceAll("[^0-9]", "");

        System.out.println(cpfSomenteNumeros);

        scan.close();
    }
}
