public class Garage {

    private VeicoliAMotore[] veicoli;
    private final int maxV = 15;
    private int idxCorrente = 0;


    //costruttore garage
    public Garage() {

        veicoli = new VeicoliAMotore[maxV];

    }

    //visualizza un veicolo
    public VeicoliAMotore getVeicolo(int posto) {
    if (posto >= 0 && posto < veicoli.length) {
        return veicoli[posto];
    }
    return null;
}


    //metodo per aggiungere un veicolo
    public boolean immettiNuovoVeicolo(VeicoliAMotore veicolo) {
    if (idxCorrente >= veicoli.length) {
        return false;
    }

    for (int i = 0; i < veicoli.length; i++) {
        if (veicoli[i] == null) {
            veicoli[i] = veicolo;
            idxCorrente++;
            return true;
        }
    }

    // Se non trovi posti liberi (anche se idxCorrente dice che c'è spazio)
    System.out.println("Nessuno slot disponibile.");
    return false;
}

 

    //metodo per estrarre un veicolo dal garage
    public VeicoliAMotore estraiVeicolo(int posto) {
    if (posto < 0 || posto >= veicoli.length) {
        System.out.println("Posizione non valida.");
        return null;
    }

    VeicoliAMotore veicoloEliminato = veicoli[posto];

    if (veicoloEliminato != null) {
        veicoli[posto] = null;
        idxCorrente--; // aggiornamento corretto del conteggio
    }

    return veicoloEliminato;
}


    public void StampaGarage() {

        for(int i = 0; i < veicoli.length; i++) {
            if(veicoli[i] != null) {
                System.out.println("Posto " + i + ":\n" + veicoli[i].toString());
            } else {
                System.out.println("Posto "+ i +" è vuoto.\n");
            }
        }
    }

}