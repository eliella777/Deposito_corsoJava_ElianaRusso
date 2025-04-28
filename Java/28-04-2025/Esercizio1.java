import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        
        //INT, FLOAT, DOUBLE, BOOLEAN, STRING

        System.out.println("Inserire un int:");
        Scanner scannerInt = new Scanner(System.in); //CREAZIONE INPUT INTERI
        int var_Int = scannerInt.nextInt();
        
        System.out.println("Inserire un float:");
        float var_Float = scannerInt.nextFloat();

        System.out.println("Inserire un double:");
        double var_Double = scannerInt.nextDouble();

        System.out.println("Inserire un boolean:");
        boolean var_Bool = scannerInt.nextBoolean();

        System.out.println("Inserire una String:");

        Scanner scannerString = new Scanner(System.in); //CREAZIONE SCANNER STRINGA
        String var_String = scannerString.nextLine();

        //STAMPA A SCHERMO TUTTE LE VARIABILI
        System.out.println(var_Int);
        System.out.println(var_Float);
        System.out.println(var_Double);
        System.out.println(var_Bool);
        System.out.println(var_String);

        



        

    }
}
