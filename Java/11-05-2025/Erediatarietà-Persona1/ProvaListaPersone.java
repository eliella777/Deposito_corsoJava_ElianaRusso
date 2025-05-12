import java.util.Scanner;

public class ProvaListaPersone {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quante persona inserire nella lista?");
        int numPersone = scanner.nextInt();
        scanner.nextLine();
        
        ElencoPersone lista1 = new ElencoPersone(numPersone);
        boolean menu = true;

        do {

            if(!lista1.controllo()) {
                    System.out.println("La lista è piena.");
                    System.out.println(lista1);
                    menu = false;
                } else {
                    
                System.out.println("Inserisci:\n1. Persona\n2. Studente\n3. Docente\n4. Termina Lista");
            
                int scelta = scanner.nextInt();
                scanner.nextLine();

                switch (scelta) {
                case 1:  

                    System.out.println("Inserisci nome:");
                    String nomeP = scanner.nextLine();
                    System.out.println("Inserisci cognome:");
                    String cognomeP = scanner.nextLine();
                    System.out.println("Inserisci Codice Fiscale:");
                    String cFP = scanner.nextLine();
                   
                    Persona p = new Persona(cFP, nomeP, cognomeP);
                    if (!lista1.aggiungiPersona(p)) {
                        System.out.println(lista1.toString());
                        menu = false;
                    } else {
                           System.out.println("Persona aggiunta alla lista.\n");
                    }

                    break;
                case 2:

                    System.out.println("Inserisci nome:");
                    String nomeS = scanner.nextLine();
                    System.out.println("Inserisci cognome:");
                    String cognomeS = scanner.nextLine();
                    System.out.println("Inserisci Codice Fiscale:");
                    String cFS = scanner.nextLine();
                    System.out.println("Inserisci Matricola:");
                    String matricola = scanner.nextLine();
                    System.out.println("Inserisci Università:");
                    String uni = scanner.nextLine();

                    Studente s = new Studente(cFS, nomeS, cognomeS, matricola, uni);
                    if (!lista1.aggiungiPersona(s)) {
                        System.out.println(lista1.toString());
                        menu = false;
                    } else {
                           System.out.println("Persona aggiunta alla lista.\n");
                    }

                    
                    break;
                case 3:

                    System.out.println("Inserisci nome:");
                    String nomeD = scanner.nextLine();
                    System.out.println("Inserisci cognome:");
                    String cognomeD = scanner.nextLine();
                    System.out.println("Inserisci Codice Fiscale:");
                    String cFD = scanner.nextLine();
                    System.out.println("Inserisci materia:");
                    String materia = scanner.nextLine();
                    System.out.println("Inserisci salario:");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    Docente d = new Docente(cFD, nomeD, cognomeD, materia, salario);
                    if (!lista1.aggiungiPersona(d)) {
                        System.out.println(lista1.toString());
                        menu = false;
                    } else {
                           System.out.println("Persona aggiunta alla lista.\n");
                    }
                    
                    break;
                case 4:
                      System.out.println("Numero di persone inserite: " + lista1.getNumPerosne() + ".\n->\n");
                      {
                        System.out.println(lista1);
                        menu = false;
                      }
                    break;
                default:
                System.out.println("Scelta non disponibile. Riprova.");
                    break;
            }
        }

            
        } while (menu);

        scanner.close();

    }
}
