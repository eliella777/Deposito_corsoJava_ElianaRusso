import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        String nome = "admin";
        int password = 12345;

        System.out.println("Inserire Nome:");
        Scanner scannerString = new Scanner(System.in);
        String nomeInserito = scannerString.nextLine();

        System.out.println("Inserire Password:");
        Scanner scannerInt = new Scanner(System.in);
        int passwordInserita = scannerInt.nextInt();

        if ((nomeInserito != nome) && (passwordInserita != password)) {
            System.out.println("Nome e Password errati.");
        } else {
            System.out.println("Credenziali corrette.");
        }


        





    }
}
