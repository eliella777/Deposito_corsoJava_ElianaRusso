public class Motocicletta extends VeicoliAMotore {
    
    protected String tipologia;
    protected int numTempiMotore;

    //costruttore con parametri
    public Motocicletta(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, String tipologia, int numTempiMotore) {

        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        this.tipologia = tipologia;
        this.numTempiMotore = numTempiMotore;

    }

    //costruttore di default
    public Motocicletta() {

    }

    //getter tipologia
    public String getTipologia() {
        return tipologia;
    }

    //setter tipologia
    public void setTipologia(String t) {
        this.tipologia = t;
    }

    //getter tempi  motore
    public int getTempiMotore() {
        return numTempiMotore;
    }

    //setter tempi motore
    public void setTempiMotore(int tempi) {
        this.numTempiMotore = tempi;
    }

    @Override
    public String toString() {
        return "MOTOCICLETTA\n" + super.toString()
                                + "- Tipo: " + tipologia + "\n"
                                + "- Tempi motore: " + numTempiMotore + "\n";
                              
    }
 


}
