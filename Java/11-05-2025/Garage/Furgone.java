public class Furgone extends VeicoliAMotore{

    protected int capacitaCarico;

    //costruttore con parametri
    public Furgone(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, int capacitaCarico) {

        //costruttore della superclasse
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        this.capacitaCarico = capacitaCarico;
    }

    //costruttore di default
    public Furgone() {

    }

    //getter capacità carico
    public int getCapacita() {
        return capacitaCarico;
    }

    //setter capacità carico
    public void setCapacita(int c) {
        this.capacitaCarico = c;
    }

    @Override
    public String toString() {

        return   "FURGONE\n" + super.toString() 
                + "- Capacità carico: " + capacitaCarico + "\n";
     

    }

    
}
