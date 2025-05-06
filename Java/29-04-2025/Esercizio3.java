import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        int etaConducente;
        int anniEsperienza;
        int numeroIncidenti;
        int pacchetto;

        Scanner scannerInt = new Scanner(System.in);
        
        //età del conducente
        System.out.println("Inserire età:");
        etaConducente = scannerInt.nextInt();
        
        if (etaConducente < 18) {
            System.out.println("Non sei idoneo per l'assicurazione");
            scannerInt.close();
            return;
        } 

        float prezzo = 500;

        if (etaConducente >= 18 && etaConducente <= 25) {
            prezzo += prezzo * 0.20;
        } else if (etaConducente > 50) {
            prezzo -= prezzo * 0.10;
        }
        
        //anni di esperienza
        System.out.println("Inserire gli anni di esperienza:");
        anniEsperienza = scannerInt.nextInt();

        if (anniEsperienza < 2) {
            prezzo += prezzo * 0.30;
        }

        //numero incidenti
        System.out.println("Inserire il numero di incidenti negli ultimi 5 anni:");
        numeroIncidenti = scannerInt.nextInt();
        
        //questo blocco dà errore quando è uguale a zero
        if (numeroIncidenti == 0) {
            prezzo = prezzo;
        } else if (numeroIncidenti == 1) {
            prezzo += prezzo * 0.15;
        } else if (numeroIncidenti == 2) {
            prezzo += prezzo * 0.30;
        } else if (numeroIncidenti >= 3) {
            System.out.println("Non sei idoneo per l'assicurazione.");
            scannerInt.close();
            return;
        } 

        //scelta pacchetto assicurativo
        System.out.println("Scegli il pacchetto assicurativo tra:\n1. Base\n2. Intermedio\n3. Premium");
        pacchetto = scannerInt.nextInt();

        switch (pacchetto) {
            case 1:
                //nessun aumento
                break;
            case 2:
                 prezzo += prezzo * 0.20;
                break;
            case 3:
                  prezzo += prezzo * 0.50;
                break;
            default:
                 System.out.println("Pacchetto non valido. Imposto il pacchetto Base.");
                break;
        }

           System.out.println("Il preventivo finale è:" + prezzo);
           scannerInt.close();
    }
}
