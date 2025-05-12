// Scrivere la classe Motorino che ha i seguenti attributi
// colore: una stringa indicante il colore del motorino, velocità:
// un numero con la virgola indicante la velocità in Km/h che
// possiede il motorino, tipo: una stringa indicante la marca e il
// modello del motorino es. “Piaggio scarabeo”, l’attributo
// antifurto un boolean che indica se è stato inserito l’antifurto
// (ha un valore iniziale pari a false). Il costruttore ha come
// parametri una stringa per il colore, una stringa per il tipo, un
// numero con la virgola per la velocità ed assegna
// opportunamente i valori dei parametri agli attributi. Scrivere
// il metodo getVelocità che restituisce la velocità del
// motorino, scrivere inoltre il metodo accelera che ha come
// parametro un numero con la virgola indicante i Km/h che si
// vogliono aggiungere alla velocità, il metodo verifica il valore
// dell’attributo antifurto se è false aggiunge il valore del
// parametro all’attributo velocità, altrimenti non fa nulla.
// Scrivere il metodo inserisciAntifurto che assegna un valore
// true all’attributo antifurto.

class Motorino {

    private String colore;
    private float velocita;
    private String tipo;
    protected boolean antifurto = false;

    public Motorino(String colore, String tipo, float velocita) {

        this.colore = colore;
        this.tipo = tipo;
        this.velocita = velocita;

    }

    //restituisce la velocità del motorino
    public float getVelocità() {
        return velocita;
    }
   
    //aumenta la velocità del motorino solo se non è inserito l'antifurto
    public void accelera(float piuVelocita) {
        if(!antifurto) {
            this.velocita += piuVelocita;
        }
    }
    
    public void setVelocita(float v) {
        this.velocita = v;
    }

    //Inserisce l'antifurto se non è ancora inserito; altrimenti stampa un messaggio
    public void inserisciAntifurto() {
        if (!antifurto) {
            antifurto = true;
        } else {
            System.out.println("L'antifurto è già inserito.");
        }
    }

}