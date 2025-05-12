public class ElencoPersone {

    private Persona[] listaPersone;
    private int indexCorrente;
    private final int numMax;

    public ElencoPersone(int numMax) {
        listaPersone = new Persona[numMax];
        this.numMax = numMax;
        indexCorrente = 0;
    }

    public boolean controllo(){
        if (!(indexCorrente < numMax)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean aggiungiPersona(Persona p) {
        if (indexCorrente < numMax) {
            listaPersone[indexCorrente] = p;
            indexCorrente++;
            return true;
        } else {
            return false;
        }
    }

    public int getNumPerosne() {
        return indexCorrente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elenco persone:\n");

        for (Persona p : listaPersone) {
            if (p != null) {
            sb.append(p.toString()).append("\n");
            }
        }

    return sb.toString();
}

}
