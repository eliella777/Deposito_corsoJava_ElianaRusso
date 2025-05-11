import java.util.Random;
public class InitArrayRandom {
    public static void main(String[] args) {
        
        int array[] = new int[10];

        //genera un numero random da 1 a 10 con la classe Math
        // for(int i = 0; i < array.length; i++) {
        //     array[i] = (int) (Math.random() * 10) + 1;
        // }

        //genera un numero da 1 a 10 con la classe Random
        Random rand = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }


        System.out.printf("%s%8s\n", "Indice", "Valore");
        for(int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d\n", i, array[i]);
        }

        }
}
