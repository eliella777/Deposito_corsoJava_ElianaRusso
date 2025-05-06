//Scrivere un programma che costruisca un conto bancario chiamato 
// harrysChecking, versi in esso $1000, prelevi da esso $500, prelevi altri $400 e 
// infine visualizzi il saldo rimanente.
// Il programma deve poi creare un altro conto bancario chiamato momsSaving, 
// utilizzando il costruttore che inizializza la variabile balance. 
// Su quest’ultimo conto deve essere poi applicato un interesse del 10%, a seguito 
// del quale viene stampato il saldo. 

class BankAccount {
    private String intestatario;
    private double saldo;

    public BankAccount(String intestatario, double saldo) {
        this.intestatario = intestatario;
        this.saldo = saldo;
    }

    public void prelevare(double soldiPrelevati) {
        if (soldiPrelevati > 0 && saldo >= soldiPrelevati) {
            saldo -= soldiPrelevati;
            System.out.println("Hai prelevato: €" + soldiPrelevati);
        } else {
            System.out.println("Saldo insufficiente o importo non valido.");
        }
    }

    public void versare(double soldiVersati) {
        if (soldiVersati > 0) {
            saldo += soldiVersati;
            System.out.println("Hai versato: €" + soldiVersati);
        } else {
            System.out.println("Importo non valido.");
        }
    }

    public void applicaInteresse(double percentuale) {
        saldo += saldo * (percentuale / 100);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIntestatario() {
        return intestatario;
    }
}



