import java.util.Scanner;;

public class ProvaSwitch {
    public static void main(String[] args) {
        
        System.out.println("Inserire un valore da 1 a 7");
        Scanner scannerInt = new Scanner(System.in);
        int day = scannerInt.nextInt();

        switch (day) {
         case 1:
          System.out.println("Monday");
          break;
         case 2:
          System.out.println("Tuesday");
          break;
         case 3:
          System.out.println("Wednesday");
          break;
         case 4:
          System.out.println("Thursday");
          break;
         case 5:
          System.out.println("Friday");
          break;
         case 6:
          System.out.println("Saturday");
          break;
         case 7:
          System.out.println("Sunday");
          break;
         default:
          System.out.println("Errore. Il valore inserito non corrisponde a un giorno della settimana.");
        } 

        scannerInt.close();

    }
}
