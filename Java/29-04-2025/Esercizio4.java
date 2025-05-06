import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        
        int a, b;
        
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Inserisci valore 1:");
        a = scannerInt.nextInt();

        System.out.println("Inserisci valore 2:");
        b = scannerInt.nextInt();

        int somma = a + b;
        int differenza = a - b;
        int prodotto = a * b;
        System.out.println("somma = "+ somma + "\ndifferenza = "+ differenza + "\nprodotto = "+ prodotto);

    }
}
