// Scrivere la classe MotorinoImmatricolato sottoclasse della
// classe Motorino che ha in più 2 attributi: maxVelocità un
// numero con la virgola (coerente con la scelta fatta per
// l’attributo velocità) indicante la velocità massima in Km/h
// che il motorino può raggiungere; targa una stringa indicante
// la targa del motorino (ad entrambi gli attributi viene
// assegnato un valore nel costruttore). Aggiungere il metodo
// getMax il metodo stampa il valore dell’attributo
// maxVelocità. Ridefinire il metodo accelera in modo che
// prima di modificare la velocità effettui un controllo sulla
// velocità massima raggiunta. Il metodo definisce una variabile
// s (dello stesso tipo di velocità) ed assegna ad s la somma tra
// il valore del parametro del metodo ed il valore dell’attributo
// velocità; se s è minore del valore dell’attributo maxVelocità
// assegna il valore di s all’attributo velocità altrimenti assegna
// all’attributo velocità il valore dell’attributo maxVelocità.

public class MotorinoImmatricolato extends Motorino {
    
    private float maxVelocita; //velocità massima che può raggiungere in Km/h
    private String targa;

    public MotorinoImmatricolato(String colore, String tipo, float velocita, float maxVelocita, String targa) {

         super(colore, tipo, velocita); //costruttore ereditato
         this.maxVelocita = maxVelocita;
         this.targa = targa;
    }

    //stampa la velocità massima a cui può andare il motorino immatricolato
    public void getMax() {
        System.out.println(maxVelocita);
    }

    //Overriding del metodo accellera ereditato da Motorino
    //oltre al controllo dell'antifurto, si aggiunge alla velocità iniziale
    //un'altra velocità; la somma, salvata in una variabile specifica, rappresenta la nuova
    //velocità corrente.
    //dopo aver controllato che non sia inserito l'antifurto, si controlla che la somma(la nuova velocità)
    // non superi la velocità massima a cui può andare il motorino immatricolato;
    //se è minore, la somma viene assegnata alla variabile velocità;
    //se è maggiore, alla variabile velocità viene assegnato il massimo dell velocità.

    @Override
    public void accelera(float piuVelocita) {
        float s = piuVelocita + getVelocità();
        
        if(!antifurto) {
             if (s < maxVelocita) {
             setVelocita(s);
        } else {
            setVelocita(maxVelocita);
        }

        }
        
    }
}
