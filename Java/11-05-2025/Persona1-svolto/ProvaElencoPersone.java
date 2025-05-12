import java.util.Scanner;

public class ProvaElencoPersone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual è il numero massimo di persone nell'elenco? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline
        
        ElencoPersone elenco = new ElencoPersone(n);
        int opzione = 1;
        
        while(opzione != 4) {
            System.out.println("Che cosa vuoi fare?");
            System.out.println("1- Inserire una persona");
            System.out.println("2- Inserire uno studente");
            System.out.println("3- Inserire un docente");
            System.out.println("4- terminare l'inserimento");
            System.out.print("Scegli l'opzione: ");
            opzione = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline
            
            if(opzione == 1) {
                System.out.print("Codice fiscale: ");
                String cf = scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Cognome: ");
                String cognome = scanner.nextLine();
                
                Persona p = new Persona(cf, nome, cognome);
                if(elenco.aggiungi(p)) {
                    System.out.println("Inserito.");
                } else {
                    System.out.println("Elenco pieno");
                }
            } else if(opzione == 2) {
                System.out.print("Codice fiscale: ");
                String cf = scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Cognome: ");
                String cognome = scanner.nextLine();
                System.out.print("Matricola: ");
                String matricola = scanner.nextLine();
                System.out.print("Università: ");
                String univ = scanner.nextLine();
                
                Studente s = new Studente(cf, nome, cognome, matricola, univ);
                if(elenco.aggiungi(s)) {
                    System.out.println("Inserito.");
                } else {
                    System.out.println("Elenco pieno");
                }
            } else if(opzione == 3) {
                System.out.print("Codice fiscale: ");
                String cf = scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Cognome: ");
                String cognome = scanner.nextLine();
                System.out.print("Materia: ");
                String materia = scanner.nextLine();
                System.out.print("Salario: ");
                double salario = scanner.nextDouble();
                scanner.nextLine(); // Consuma il newline
                
                Docente d = new Docente(cf, nome, cognome, materia, salario);
                if(elenco.aggiungi(d)) {
                    System.out.println("Inserito.");
                } else {
                    System.out.println("Elenco pieno");
                }
            }
        }
        
        System.out.println(elenco.toString());
        scanner.close();
    }
}