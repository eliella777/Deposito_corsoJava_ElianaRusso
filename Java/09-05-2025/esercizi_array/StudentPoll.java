 // Programma per l'analisi dei risultati di un sondaggio.
public class StudentPoll {
    public static void main(String[] args) {
         
// array risposte studenti (solitamente inserite durante l'esecuzione)
      int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 14, 3, 3, 3, 2, 3, 3, 2, 5};
      int[] frequency = new int[6]; // array di contatori frequenza

     
// per ogni risposta, seleziona l'elemento di responses e usa quel valore
      
// come indice per determinare l'elemento di frequency da incrementare
      for (int answer = 0; answer < responses.length; answer++) {
         try {
            ++frequency[responses[answer]];
         }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e); // invoca il metodo toString
            System.out.printf(" responses[%d] = %d%n%n", answer, responses[answer]);
         }
      }
 
      System.out.printf("%s%10s%n", "Rating", "Frequency");
 
      // stampa il valore di ogni elemento dell'array
       for (int rating = 1; rating < frequency.length; rating++) {
       System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
}
