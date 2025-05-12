public class Automobile extends VeicoliAMotore{

    protected int numPorte;

    //costruttore con parametri
    public Automobile (int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, int numPorte) {

        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        this.numPorte = numPorte;

    }

    //costruttore di default
    public Automobile() {

    }

    //getterr numero porte
    public int getNumPorte() {
        return numPorte;
    }

    //setter numero porte
    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }

    @Override
    public String toString() {

        return "AUTOMOBILE\n" + super.toString() 
                + "- Numero di porte: " + numPorte + "\n";
    }
    
}
