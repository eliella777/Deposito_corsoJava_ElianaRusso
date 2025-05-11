import java.util.Scanner;

public class TestLampadina {
    public static void main(String[] args) {
        
        Lampadina lampadina1 = new Lampadina();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire il numero massimo di click della lampadina:");
        int limiteClick = scanner.nextInt();
        scanner.nextLine();
        lampadina1.setClick(limiteClick);


        boolean menu = true;

        while (menu) {
            
            System.out.println("MENU");
            System.out.println("1. Stato della lampadina\n2. Click\n3. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Stato della lampadina: " + lampadina1.stato());
                    break;
                case 2:
                    lampadina1.click();
                    System.out.println("Stato attuale: " + lampadina1.stato());
                    break;
                case 3:
                    System.out.println("Uscita dal programma.");
                    menu = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile. Riprova.");
                    break;
            }
            
        }

    }
}
