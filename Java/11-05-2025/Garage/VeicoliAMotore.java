public class VeicoliAMotore {

    protected int annoImmatricolazione;
    protected String marca;
    protected String tipoAlimentazione;
    protected int cilindrata;

    //costruttore con parametri
    public VeicoliAMotore(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {

        this.annoImmatricolazione = annoImmatricolazione;
        this.marca = marca;
        this.tipoAlimentazione = tipoAlimentazione;
        this.cilindrata = cilindrata;
    }
    
    //costruttore di default
    public VeicoliAMotore() {

    }

 //getter anno immatricolazione   
public int getAnnoImm() {
    return annoImmatricolazione;
}

//setter anno immatricolazione
public void setAnnoImm(int annoImmatricolazione) {
    this.annoImmatricolazione = annoImmatricolazione;
}

//getter marca veicolo
public String getMarca() {
    return marca;
}

//setter marca veicolo
public void setMarca(String marca) {
    this.marca = marca; 
}

//getter tipo alimentazione
public String getTipoAlimentazione() {
    return tipoAlimentazione;
}

//setter tipo alimentazione
public void setTipoAlimentazione(String tipoAlimentazione) {
    this.tipoAlimentazione = tipoAlimentazione;
}

//getter cilindrata
public int getCilindrata() {
    return cilindrata;
}

//setter cilindrata
public void setCilindrata(int cilindrata) {
    this.cilindrata = cilindrata;
}

public String toString() {

        return "- Anno immatricolazione: " + annoImmatricolazione + "\n"
                + "- Marca: "+ marca + "\n"
                + "- Alimentazione: " + tipoAlimentazione + "\n"
                + "- Cilindrata: " + cilindrata + "\n";
}

}
