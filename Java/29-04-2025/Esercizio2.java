import java.util.Scanner;;

public class Esercizio2 {
    public static void main(String[] args) {
        
        int numero = 5;
        
        System.out.println("Inserisci un numero da 1 a 10:");
        
        Scanner scannerInt = new Scanner(System.in);
        int numeroDaIndovinare = scannerInt.nextInt();

        if (numeroDaIndovinare < numero) {
            System.out.println("è più grande.");
        } else if (numeroDaIndovinare > numero) {
            System.out.println("è più piccolo.");
        } else {
            System.out.println("Indovinato!");
        }

    }
}
