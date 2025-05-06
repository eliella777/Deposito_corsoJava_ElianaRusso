import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
    
    float prezzoCaffe = 1.50f;
    float prezzoCappuccino = 2.00f;
    float prezzoTe = 1.00f;
    float prezzoAcqua = 0.50f;    

    float credito = 10.0f;
    int selezione;

    do {
    
        System.out.println("Credito disponibile: " + credito);

    System.out.println("Menu:");
    System.out.println("1. Caffè - 1.50€");
    System.out.println("2. Cappuccino - 2.00€");
    System.out.println("3. Té - 1.00€");
    System.out.println("4. Acqua - 0.50€");
    System.out.println("5. Uscire");

    System.out.println("Seleziona:");
    Scanner scanner = new Scanner(System.in);
    selezione = scanner.nextInt();

    switch (selezione) {
        case 1:
            if (credito > prezzoCaffe) {
                credito = credito - prezzoCaffe;
            }
            break;
        case 2:
            if (credito > prezzoCappuccino) {
            credito = credito - prezzoCappuccino;
            }
            break; 
        case 3:
            if (credito > prezzoTe) {
            credito = credito - prezzoTe;
            }
            break; 
        case 4:
            if (credito > prezzoAcqua) {
            credito = credito - prezzoAcqua;
            }
            break;  
        case 5:
            System.out.println("Grazie per aver utilizzato il distributore. Arrivederci.");
            break; 
        default:
            System.out.println("Errore");
            break;
    }

    } while (selezione != 5);

    System.out.println("Credito residuo: " + credito);

    }
}
