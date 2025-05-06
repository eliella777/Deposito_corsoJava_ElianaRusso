// Calcolo del preventivo per un piano telefonico.
// Scrivi un programma che calcoli il costo mensile di un piano telefonico in 
// base ai seguenti criteri:

// 1. Tipologia di piano:
// Base: prezzo standard 10€
// Plus: +5€ rispetto al piano Base
// Premium: +10€ rispetto al piano base

// 2. Minuti inclusi:
// fino a 100 minuti: nessun costo aggiuntivo
// oltre i 100 minuti: 0.10€ per ogni minuto extra

// 3. SMS inclusi:
// fino a 50 SMS: nessun costo aggiuntivo
// oltre i 50 SMS: 0.05€ per ogni SMS extra

// 4. Dati mobili (GB):
// fino a 5 GB: nessun costo aggiuntivo
//oltre i 5 GB: 2€ per ogni GB extra

// 5. Sconti:
// se l'utente ha meno di 18 anni: sconto del 10% sul totale
// se l'utente ha piu di 65 anni: sconto del 5% sul totale

// Il programma deve chiedere all'utente di inserire i dati necessari (tipologia di piano, numero di minuti,
// numero di SMS, GB consumati, età).
// Calcolare il costo totale del piano telefonico.
// Stampare il costo finale con tutti i dettagli (costo base, eventuali costi aggiuntivi, sconti applicati).

import java.util.Scanner;
public class Esercizio1 {

    public static void main(String[] args) {
        
         String tipoPiano;
         int numMinuti;
         int numSms;
         int gb;
         int eta;

         double prezzo = 10;
         double prezzoPiano = 0;
         double costoAggMin = 0;
         double costoAggSms = 0;
         double costoAggGb = 0;
         double sconto = 0;

         Scanner scanner = new Scanner(System.in);

         System.out.println("Scegli un piano telefonico:");
         System.out.println("Base\nPlus\nPremium");
         tipoPiano = scanner.nextLine();
         tipoPiano = tipoPiano.toLowerCase();

         //scelta del piano telefonico con relative modifiche
         if (tipoPiano.equals("plus")) {
            prezzo+= 5;
            prezzoPiano = 5;
         } else if (tipoPiano.equals("premium")) {
            prezzo+= 10;
            prezzoPiano = 10;
         }

         //calcolo costi aggiuntivi dei minuti
         System.out.println("Numero di minuti:");
         numMinuti = scanner.nextInt();
         scanner.nextLine();

         if (numMinuti > 100) {
            double minExtra = numMinuti - 100;
            costoAggMin =  minExtra * 0.10;
            prezzo = prezzo + costoAggMin;
         }

         //calcolo costi aggiuntivi degli SMS
         System.out.println("Numero di SMS:");
         numSms = scanner.nextInt();
         scanner.nextLine();

         if (numSms > 50) {
            double smsExtra = numSms - 50;
            costoAggSms = smsExtra * 0.05;
            prezzo = prezzo + costoAggSms;
         }

         //calcolo costi aggiuntivi dei dati mobili
         System.out.println("Numero di GB:");
         gb = scanner.nextInt();
         scanner.nextLine();

         if (gb > 5) {
            double gbExtra = gb - 5;
            costoAggGb = gbExtra * 2;
            prezzo = prezzo + costoAggGb;
         }

         //calcolo sconto in base all'età
         System.out.println("Inserire la propria età:");
         eta = scanner.nextInt();
         scanner.nextLine();

         if (eta < 18) {
            sconto = 10; //10%
            prezzo = prezzo * (1 - sconto / 100);
         } else if (eta > 65) {
            sconto = 5; //5%
            prezzo = prezzo * (1 - sconto / 100);
         }


        System.out.println("Ecco un riepilogo delle spese:");
        System.out.println("Piano base: "+ tipoPiano + "(" + prezzoPiano + "€)");
        System.out.println("Minuti: "+ numMinuti + "(" + costoAggMin +"€)");
        System.out.println("SMS: "+ numSms + "(" + costoAggSms +"€)");
        System.out.println("GB: "+ gb + "(" + costoAggGb +"€)");
        System.out.println("Sconto: "+ sconto + "%");
        System.out.printf("Costo finale: %.2f€\n", prezzo);

        scanner.close();
    }

}
