 // Inizializza gli elementi di un array al valore zero predefinito.
public class InitArray {
    public static void main(String[] args) {

        int array[] = new int[10];

        for(int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        
        System.out.printf("%s%8s\n", "Indice", "Valore");
        for(int i = 0; i < array.length; i++) {
            System.err.printf("%5d%8d\n", i, array[i]);
        }

    }
}
