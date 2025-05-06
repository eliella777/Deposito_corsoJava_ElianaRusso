//Scrivere un programma che costruisca un conto bancario chiamato 
// harrysChecking, versi in esso $1000, prelevi da esso $500, prelevi altri $400 e 
// infine visualizzi il saldo rimanente.
// Il programma deve poi creare un altro conto bancario chiamato momsSaving, 
// utilizzando il costruttore che inizializza la variabile balance. 
// Su quest’ultimo conto deve essere poi applicato un interesse del 10%, a seguito 
// del quale viene stampato il saldo. 

import java.util.Scanner;
public class BankAccountMain {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Primo conto: harrysChecking
        BankAccount harrysChecking = new BankAccount("Harry", 0);

        String risposta;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Versa denaro");
            System.out.println("2 - Preleva denaro");
            System.out.println("3 - Visualizza saldo");
            System.out.print("Scelta: ");
            int scelta = myScanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci l'importo da versare: ");
                    double versamento = myScanner.nextDouble();
                    harrysChecking.versare(versamento);
                    break;

                case 2:
                    System.out.print("Inserisci l'importo da prelevare: ");
                    double prelievo = myScanner.nextDouble();
                    harrysChecking.prelevare(prelievo);
                    break;

                case 3:
                    System.out.println("Saldo attuale: €" + harrysChecking.getSaldo());
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
            }

            System.out.print("Vuoi effettuare un'altra operazione? (si/no): ");
            risposta = myScanner.next().toLowerCase();

        } while (risposta.equals("si") || risposta.equals("s"));

        // Nuovo conto: momsSaving
        BankAccount momsSaving = new BankAccount("Mom", 1000); // Saldo iniziale di 1000 euro

        System.out.println("\nSaldo iniziale del conto Moms Saving: €" + momsSaving.getSaldo());

        // Applica interesse del 10%
        momsSaving.applicaInteresse(10);

        // Stampa il saldo dopo l'applicazione degli interessi
        System.out.println("Saldo dopo l'applicazione del 10% di interesse: €" + momsSaving.getSaldo());

        System.out.println("Fine del programma. Arrivederci!");

        myScanner.close();
    }
    
}
