import java.util.Scanner;

public class ProvaCicli {
    public static void main(String[] args) {
        
//PROVA CICLO WHILE
int i = 1; 
// Inizializzazione della variabile di controllo
while (i <= 5) {
 System.out.println(i);
 i++; // Incremento della variabile di controllo
}


//PROVA CICLO DO..WHILE
int k = 0;
do {
    System.out.println("numero: "+ k);
    k++;
} while (k < 5);


//PROVA CICLO BOOLEANO
/* 
    boolean controllo = true;

    while (controllo) {
        //primo menu
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vuoi continuare?");
        String x = scanner.nextLine();
        if (x.equals("no") || x.equals("stop")) {
        controllo = false;

    }  

            scanner.close();
} */
    
        Scanner scanner = new Scanner(System.in);
        
        // Richiede un numero all'utente
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        // Stampa la tabellina del numero
        System.out.println("Tabellina del " + numero + ":");

        // Ciclo for per moltiplicare il numero da 1 a 10
        for (int z = 1; z <= 10; z++) {
            System.out.println(numero + " x " + z + " = " + (numero * z));
        }
}

    
}
