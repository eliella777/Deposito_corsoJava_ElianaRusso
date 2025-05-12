public class Studente extends Persona {
    
    private String matricola;
    private String universita;

    public Studente(String codiceFiscale, String nome, String cognome, String matricola, String universita) {
        super(codiceFiscale, nome, cognome);
        this.matricola = matricola;
        this.universita = universita;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void setUniversita(String universita) {
        this.universita = universita;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getUniversita() {
        return universita;
    }

    @Override
    public String toString() {
        return super.toString() + "| Studente: matricola > " + matricola + ", università > " + universita;
    }

}    
    
