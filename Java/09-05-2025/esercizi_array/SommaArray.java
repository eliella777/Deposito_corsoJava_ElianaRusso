// Calcolo della somma degli elementi di un array.
public class SommaArray {
    public static void main(String[] args) {
        
        int array[] = new int[5];
        int somma = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 2;
            somma += array[i];
        }

        System.out.println("Valori:");
        for(int i = 0; i < array.length; i++) {
            System.out.printf(array[i]+" ");
        }
        

        System.out.println("\nSomma: "+ somma);

        

    }
}
