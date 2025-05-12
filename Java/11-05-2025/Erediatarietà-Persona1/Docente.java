public class Docente extends Persona {

    private String materia;
    private double salario;

    public Docente(String codiceFiscale, String nome, String cognome, String materia, double salario) {
        
        super(codiceFiscale, nome, cognome);
        this.materia = materia;
        this.salario = salario;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + "| Docente: materia > " + materia + ", salario > " + salario;
    }
    
}
