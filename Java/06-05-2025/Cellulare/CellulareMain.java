public class CellulareMain {
    public static void main(String[] args) {

  /**Creo un oggetto della classe Cellulare, 
con 20€ di credito e 0 chiamate effettuate.*/ 
Cellulare nokia = new Cellulare(20.0,0); 
/**Ricarico il cellure di 50€.*/ 
nokia.ricarica(50.0); 
/**Effettuo una chiamata di 13 minuti.*/ 
nokia.chiamata(13.0); 
/**Stampo il credito.*/ 
System.out.println(nokia.numero404()); 
/**Stampo l'aspettativa di credito.*/ 
System.out.println("Credito, mi aspetto: 67.4"); 
/**Stampo il numero di chiamate effettuate.*/ 
System.out.println(nokia.getNumeroChiamate()); 
/**Stampo l'aspettativa del numero di chiamate effettuate.*/ 
System.out.println("Numero Chiamate, mi aspetto: 1"); 
/**Azzero il numero di chiamate effettuate.*/ 
nokia.azzeraChiamate(); 
/**Stampo il numero di chiamate effettuate.*/ 
System.out.println(nokia.getNumeroChiamate()); 
/**Stampo l'aspettativa del numero di chiamate effettuate.*/ 
System.out.println("Numero Chiamate, mi aspetto: 0"); 

   }
}

