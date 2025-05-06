public class CC {

    private double saldo;
    private String [] tipoMovimenti = new String[10];
    private double [] importoMovimenti = new double[10];
    private int index = 0;

    //costruttore di default
    public CC() {
        
        this.saldo = (double)0;

    }
    
    //costruttore con parametri
    public CC (double saldoIniziale) {
        this.saldo = saldoIniziale;

    }

    public void versamento(double v) {
        saldo += v;
        inserisciMovimenti("Versamento", v);
    }

    public void prelievo(double p) {
        if (saldo >= p) {
            saldo -= p;
            inserisciMovimenti("Prelievo", p);
        } else {
            System.out.println("Saldo insufficiente.");
        }
    
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void inserisciMovimenti(String tipo, double importo) {
        int posizione = index % 10;
        tipoMovimenti[posizione] = tipo;
        importoMovimenti[posizione] = importo;
        index++;
    }

    public void stampaUltimi5Movimenti() {
        System.out.println("Ultimi 5 movimenti:");
        int count = Math.min(index, 5);
        for(int i = index - count; i < index; i++) {
            int pos = i % 10;
            System.out.printf("%s: %.2f%n", tipoMovimenti[pos], importoMovimenti[pos]);
        }

    }
}