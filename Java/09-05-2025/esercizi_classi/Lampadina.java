// Scrivere la classe Lampadina i cui oggetti rappresentano delle lampadine elettriche. Una
// lampadina pu`o essere accesa, spenta o rotta, e mette a disposizione due sole operazioni: stato() che
// restituisce una stringa che indica lo stato corrente della lampadina e click() che ne cambia lo stato da
// accesa a spenta o da spenta a accesa o la rompe. Una lampadina si rompe dopo un certo numero di click
// definito dal fabbricante. La classe deve contenere:
// • Una o più variabili d’istanza che descrivano opportunamente lo stato della lampadina
// • Un opportuno costruttore
// • I metodi previsti
// Per testare la classe, scrivere un programma TestLampadina che crea un oggetto della classe Lampadina
// che ammetta un numero massimo di click deciso dall’utente e poi iterativamente offre all’utente la possibilità 
// di invocare una delle due funzionalità (visualizzando l’esito dell’operazione, nel caso di stato())
// o di terminare l’esecuzione.

public class Lampadina {

    private boolean accesa;
    private boolean rotta;
    private int currentClick;
    private int numMaxClick;

    public Lampadina(int clicks) {
        numMaxClick = clicks;
    }

    public Lampadina() {
        numMaxClick = 10; // valore predefinito
    }

    public void setClick(int c) {
        numMaxClick = c;
    }

    public String stato() {
        if (rotta) {
            return "rotta";
        }
        return accesa ? "accesa" : "spenta";
    }

    public void click() {
        if (!rotta) {
            if (currentClick < numMaxClick) {
                accesa = !accesa;
                currentClick++;
                if (currentClick >= numMaxClick) {
                    rotta = true;
                    accesa = false;
                    System.out.println("La lampadina si è rotta.");
                }
            }
        } else {
            System.out.println("La lampadina è già rotta.");
        }
    }
}
