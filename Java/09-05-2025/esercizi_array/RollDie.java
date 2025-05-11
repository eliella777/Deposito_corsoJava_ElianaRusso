import java.util.Random;
public class RollDie {
    public static void main(String[] args) {
        

        int[] frequenza = new int[7]; //array di contatori di frequenza

        Random rand = new Random();

        //lancia il dado 100 volte
        for(int roll = 1; roll <= 100; roll++) {
            ++frequenza[rand.nextInt(6) + 1]; //genera un numero casuale tra 1 e 6
        }

        System.out.printf("%s%10s\n", "Facce", "Frequenza");
        for(int i = 1; i < frequenza.length; i++) {
            System.out.printf("%d: ", i);
            for(int j = 0; j < frequenza[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
