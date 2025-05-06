import java.util.Scanner;

public class Esercizio6 {
    public static void main(String[] args) {
    
        String savedUsername = null;
        String savedPassword = null;
        boolean loggedIn = false;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Registrati\n2. Login\n3. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // consuma newline

            if (scelta == 1) {
                System.out.print("Inserisci username: ");
                savedUsername = scanner.nextLine();
                System.out.print("Inserisci password: ");
                savedPassword = scanner.nextLine();
                System.out.println("Registrazione completata.");
            } else if (scelta == 2) {
                if (savedUsername == null) {
                    System.out.println("Nessun utente registrato.");
                } else {
                    System.out.print("Username: ");
                    String u = scanner.nextLine();
                    System.out.print("Password: ");
                    String p = scanner.nextLine();
                    if (u.equals(savedUsername) && p.equals(savedPassword)) {
                        System.out.println("Login riuscito!");
                        loggedIn = true;

                        while (loggedIn) {
                            System.out.println("\nBenvenuto " + savedUsername + "!");
                            System.out.println("1. Calcolatrice\n2. Cambia Password\n3. Logout");
                            System.out.print("Scelta: ");
                            int scelta2 = scanner.nextInt();
                            scanner.nextLine();

                            if (scelta2 == 1) {
                                System.out.print("Numero 1: ");
                                double a = scanner.nextDouble();
                                System.out.print("Numero 2: ");
                                double b = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.print("Operazione (+ - * /): ");
                                String op = scanner.nextLine();

                                if (op.equals("+")) {
                                    System.out.println("Risultato: " + (a + b));
                                } else if (op.equals("-")) {
                                    System.out.println("Risultato: " + (a - b));
                                } else if (op.equals("*")) {
                                    System.out.println("Risultato: " + (a * b));
                                } else if (op.equals("/")) {
                                    if (b != 0) {
                                        System.out.println("Risultato: " + (a / b));
                                    } else {
                                        System.out.println("Errore: divisione per zero.");
                                    }
                                } else {
                                    System.out.println("Operazione non valida.");
                                }

                            } else if (scelta2 == 2) {
                                System.out.print("Nuova password: ");
                                savedPassword = scanner.nextLine();
                                System.out.println("Password cambiata.");
                            } else if (scelta2 == 3) {
                                loggedIn = false;
                                System.out.println("Logout effettuato.");
                            } else {
                                System.out.println("Scelta non valida.");
                            }
                        }
                    } else {
                        System.out.println("Credenziali errate.");
                    }
                }
            } else if (scelta == 3) {
                System.out.println("Chiusura del programma.");
                break;
            } else {
                System.out.println("Scelta non valida.");
            }
        }
    }
    }

