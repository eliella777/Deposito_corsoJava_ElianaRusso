public class ProvaOperatori {
    public static void main(String[] args) {
        
        //PROVA CON OPERATORI ARITMETICI
        int x = 10;
        x += 5;

        System.out.println(x);

        x++;
        System.out.println("vaiabile x dopo l'incremento: " + x);

        x--;
        System.out.println("vaiabile x dopo il decremento: " + x);

        //PROVA CON OPERATORI DI CONFRONTO
        int y = 10;
        int z = 5;
        
        System.out.println(y + " è maggiore di " + z + "?");
        System.out.println( y > z);

        System.out.println(y + " è uguale a " + z + "?");
        System.out.println( y == z);

        System.out.println(y + " è diverso da " + z + "?");
        System.out.println( y != z);

        //PROVA OPERATORI LOGICI
        System.out.println( y < 10 &&  y > 5);
       


    }
}
