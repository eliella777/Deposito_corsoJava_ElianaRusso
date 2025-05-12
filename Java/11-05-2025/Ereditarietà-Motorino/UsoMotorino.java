// Scrivere la classe UsoMotorino che ha il metodo
// main in cui si istanzia un oggetto di tipo Motorino
// di colore grigiometallizzato con velocità 40,5 e tipo
// Piaggio Liberty , richiamare il metodo getVelocità
// memorizzandone il valore in una variabile.
// Istanziare un altro oggetto di tipo
// MotorinoImmatricolato con colore rosso, velocità
// 30,5 tipo Aprilia Scarabeo, maxvelocità 60 targa
// CV1234, e richiamare il metodo getMax. Infine
// richiamare il metodo accelera con parametro pari a
// 30,7 per entrambi gli oggetti e quindi richiamare il
// metodo getVelocità per entrambi gli oggetti
// stampando i due valori.

public class UsoMotorino {
    public static void main(String[] args) {

        Motorino motorino1 = new Motorino("grigiometallizzato", "Piaggio Liberty", 40.5f);

        float velocita = motorino1.getVelocità();
        System.out.println("Velocità del motorino non immatricolato: " + velocita);

        MotorinoImmatricolato motorinoIM1 = new MotorinoImmatricolato("rosso", "Aprilia Scarabeo", 30.5f, 60f, "CV1234");
        
        System.out.printf("Velocità massima del motorino immatricolato: ");
        motorinoIM1.getMax();
        System.out.println("Velocità a cui sta andando: " + motorinoIM1.getVelocità());

        System.out.println("I mororini accellerano di 30.7 Km/h\n");
        motorino1.accelera(30.7f);
        motorinoIM1.accelera(30.7f);

        System.out.println("Nuova velocità del motorino: " + motorino1.getVelocità());
        System.out.println("Nuova velocità del motorino immatricolato: " + motorinoIM1.getVelocità());



    }
}
