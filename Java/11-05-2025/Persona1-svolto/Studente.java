public class Studente extends Persona {
private String matricola;
private String università;
public Studente(String codiceFiscale, String nome, String cognome,
String matricola, String università) {
super(codiceFiscale, nome, cognome);
this.matricola=matricola;
this.università=università;
}
public String getMatricola() {
return matricola;
}
public void setMatricola(String matricola) {
this.matricola = matricola;
}
public String getUniversità() {
return università;
}
public void setUniversità(String università) {
this.università = università;
}
public String toString() {
return "Studente [codiceFiscale=" + this.getCodiceFiscale() +
", nome=" + this.getNome() +
", cognome=" + this.getCognome() +
", matricola=" + matricola +
", università="+ università + "]";
}
}