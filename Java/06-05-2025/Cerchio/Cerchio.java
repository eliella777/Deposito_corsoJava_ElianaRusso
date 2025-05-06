import java.util.Scanner;

public class Cerchio {

    //attributi privati
    private double raggio;

    //costruttore di defaul
    public Cerchio() {
        this.raggio = (double)0;
    }

    //costruttore con parametri
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    // C = 2 * piGreco * raggio
    public double calcolaCirconferenza() {
        double circonferenza = 2 * Math.PI * raggio;
        return circonferenza;
    }

    //PiGreco * raggio^2
    public double calcolaArea() {
        double area = Math.PI * Math.pow(raggio, 2);
        return area;
       }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(Scanner scanner) {
        this.raggio = scanner.nextDouble();
        scanner.nextLine();
    }

    
}