import java.util.Scanner;

public class CerchioTester {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Cerchio cerchio1 = new Cerchio();

        System.out.println("Inserire il raggio:");

        cerchio1.setRaggio(scanner);

        boolean continua = true;

        while (continua) {

            System.out.println("Menu");
            System.out.println("1. Calcola l'area del cerchio.");
            System.out.println("2. Calcola la circonferenza del cerchio.");
            System.out.println("3. Nuovo raggio.");
            System.out.println("4. Esci.");

            int scelta = scanner.nextInt();
            scanner.nextLine();


            switch (scelta) {
                case 1:
                    double area = cerchio1.calcolaArea();
                    System.out.printf("L'area del cerchio è: %.2f\n", area);
                    break;
                case 2:
                double circonferenza = cerchio1.calcolaCirconferenza();
                System.out.printf("La circonferenza del cerchio è: %.2f\n", circonferenza);
                    break;
                case 3:
                    System.out.println("Inserisci il nuovo raggio.");
                    cerchio1.setRaggio(scanner);
                    break;
                case 4:
                    System.out.println("Chiusura del programma. Arrivederci.");
                    continua = false;
                    break;
                default: 
                    System.out.println("Errore. Opzione non disponibile");
                    break;
            }
            
        } 

        scanner.close();

    }
}