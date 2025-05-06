

public class ProvaMath {
    public static void main(String[] args) {
        
        //trova il maggiore
        System.out.println(Math.max(3, 8));
        
        //trova il minore
        System.out.println(Math.min(3, 8));

        //trova la radice quadrata
        System.out.println(Math.sqrt(64));

        //restituisce il valore assoluto (positivo)
        System.out.println(Math.abs(-4.7));

        //Math.random() restituisce un numero casuale compreso tra 0.0
        //(incluso) e 1.0 (escluso):
        
        //se desideri solo un numero casuale compreso tra 0 e 100, puoi utilizzare la seguente formula
        int randomNum = (int)(Math.random() * 101); // 0 to 100

    }
}
