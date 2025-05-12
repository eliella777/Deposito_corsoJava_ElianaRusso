import java.util.Scanner;

public class MainGarage {
    public static void main(String[] args) {

        //creo l'oggetto garage
        Garage garage = new Garage();
        Scanner scanner = new Scanner(System.in);
        
        //inizia il ciclo del menu che continua fino a quando non incontra un break
        while (true) {
            
            //stampa delle opzioni del menu
            System.out.println("MENU");
            System.out.println("1. Inserisci un veicolo.\n2. Estrai un veicolo\n3. Visualizza la situazione del garage\n4. Esci dal programma\n");
            int scelta = scanner.nextInt();
            scanner.nextLine(); //pulisce il buffer
    
            //se si sceglie di inserire un veicolo
            if(scelta == 1) {
                
                //si chiede anche che tipo di veicolo inserire
                System.out.println("Che tipo di veicolo desidera inserire?\n<(Automibile; Furgone; Motocicletta)>");
                String sceltaVeicolo = scanner.nextLine();

                //controlla che l'input sia la parola furgone ignorando le maiuscole e minuscole
                if(sceltaVeicolo.equalsIgnoreCase("automobile")) {
                    
                    //si inseriscono tutte le variabile che andranno poi a rappresentare gli argomenti da passare al 
                    //costruttore del nuovo oggetto automobile
                    System.out.println("Inserire l'anno di immatricolazione: ");
                    int annoImm = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserire la marca:");
                    String marca = scanner.nextLine();
                    System.out.println("Inserire il tipo di alimentazone:");
                    String alimentazione = scanner.nextLine();
                    System.out.println("Inserire la cilindrata:");
                    int cilindrata = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserire il numero di porte:");
                    int numPorte = scanner.nextInt();
                    scanner.nextLine();

                    //creazione istanza automobile con il costruttore
                    Automobile auto = new Automobile(annoImm, marca, alimentazione, cilindrata, numPorte);
                    //controllo della disponibilità di posti nel garage
                    if(!garage.immettiNuovoVeicolo(auto)) {
                        System.out.println("Il garage è pieno (potenzialmente).");
                        //se c'è posto si stampa un messaggio di conferma
                    } else {
                        System.out.println("Veicolo aggiunto con successo.");
                    }
                    
                    //controlla che l'input sia la parola furgone ignorando le maiuscole e minuscole
                } else if (sceltaVeicolo.equalsIgnoreCase("furgone")) {
                    
                    //si inseriscono tutte le variabile che andranno poi a rappresentare gli argomenti da passare al 
                    //costruttore del nuovo oggetto furgone
                    System.out.println("Inserire l'anno di immatricolazione: ");
                    int annoImm = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserire la marca:");
                    String marca = scanner.nextLine();
                    System.out.println("Inserire il tipo di alimentazone:");
                    String alimentazione = scanner.nextLine();
                    System.out.println("Inserire la cilindrata:");
                    int cilindrata = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserire la capacità del carico:");
                    int capacitaCarico = scanner.nextInt();
                    scanner.nextLine();

                    //creazione istanza furgone con il costruttore
                    Furgone furgone = new Furgone(annoImm, marca, alimentazione, cilindrata, capacitaCarico);
                    if(!garage.immettiNuovoVeicolo(furgone)) {
                        System.out.println("Il garage è pieno (potenzialmente).");
                    } else {
                        System.out.println("Veicolo aggiunto con successo.");
                    }
                    
                    //controlla che l'input sia la parola furgone ignorando le maiuscole e minuscole
                } else if (sceltaVeicolo.equalsIgnoreCase("motocicletta")) {

                    System.out.println("Inserire l'anno di immatricolazione: ");
                    int annoImm = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserire la marca:");
                    String marca = scanner.nextLine();
                    System.out.println("Inserire il tipo di alimentazone:");
                    String alimentazione = scanner.nextLine();
                    System.out.println("Inserire la cilindrata:");
                    int cilindrata = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserire il tipo di motocicletta:");
                    String tipo = scanner.nextLine();
                    System.out.println("Inserire il numero di tempi del motore:");
                    int tempiMotore = scanner.nextInt();
                    scanner.nextLine();

                    //creazione istanza motocicletta con il costruttore
                    Motocicletta motocicletta = new Motocicletta(annoImm, marca, alimentazione, cilindrata, tipo, tempiMotore);
                    if(!garage.immettiNuovoVeicolo(motocicletta)) {
                        System.out.println("Il garage è pieno (potenzialmente).");
                    } else {
                        System.out.println("Veicolo aggiunto con successo.");
                    }
                    
                } else {
                    System.out.println("Opzione incompatibile. Riprova");
                } //fine scelta dell'inserimento


            } else if (scelta == 2) {

                System.out.println("Qual è il numero del posto del veicolo da estrarre?");
                int posto = scanner.nextInt();
                scanner.nextLine();

                // Controlla che il posto sia valido
                VeicoliAMotore veicoloDaVisualizzare = garage.getVeicolo(posto);
                if (veicoloDaVisualizzare == null) {
                System.out.println("Nessun veicolo in quel posto.");
                } else {
                System.out.println("Veicolo al posto " + posto + ":\n" + veicoloDaVisualizzare + "\n");
                System.out.println("Desideri estrarre questo veicolo? (si/no)");
                String risposta = scanner.nextLine();

                if (risposta.equalsIgnoreCase("si")) {
                garage.estraiVeicolo(posto); // Ora sì, rimuovi
                System.out.println("Veicolo estratto con successo.");
                } else {
                System.out.println("Operazione annullata.");
               }
            }


            } else if (scelta == 3) {

                System.out.println("Situazone attuale del garage:");
                garage.StampaGarage();
                
            } else if (scelta == 4) {

                System.out.println("Arrivederci.");
                break;
                
            } else {
                System.out.println("Scelta non disponibile. Riprova.");
            }

        }
        scanner.close();

    }

}
