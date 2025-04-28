import java.util.Scanner; // Import the Scanner class

public class ScannerProva {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in); // Create a Scanner object
  System.out.println("Enter username");

  String userName = scanner.nextLine(); // Read user input
  System.out.println("Username is: " + userName);

  Scanner scannerInt = new Scanner(System.in); //creo un altro oggetto di tipo Scanner
  System.out.println("Enter age"); 

  int userAge = scannerInt.nextInt(); //leggo l'età
  System.out.println("Age is: " + userAge);
  }


}  // Output user input

