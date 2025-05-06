import java.util.Scanner;

public class CCTester {
    public static void main(String[] args) {

        CC contoCorrente1 = new CC();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Menu\n");
            System.out.println("1. Saldo\n2. Versamento\n3. Prelevamento\n4. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta == 1) {
                double saldo = contoCorrente1.getSaldo();
                System.out.printf("Il saldo ammonta a %.2f\n", saldo);
            } else if (scelta == 2) {
                System.out.println("Inserire la somma da versare:");
                double versamento = scanner.nextDouble();
                scanner.nextLine();

                contoCorrente1.versamento(versamento);

            } else if (scelta == 3) {
                System.out.println("Inserire la somma da prelevare:");
                double prelevamento = scanner.nextDouble();
                scanner.nextLine();

                contoCorrente1.prelievo(prelevamento);
            } else if (scelta == 4) {
                System.out.println("Chiusura del programma. Arrivederci.");
                System.out.println("Saldo: " + contoCorrente1.getSaldo());
                contoCorrente1.stampaUltimi5Movimenti();
                break;
            } else {
                System.out.println("Errore. Opzione non disponibie, riprova.");
            }


        }
         scanner.close();


    }
}
