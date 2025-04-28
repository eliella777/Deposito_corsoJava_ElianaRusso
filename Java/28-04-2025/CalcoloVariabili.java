public class CalcoloVariabili {
public static void main(String[] args) {

    System.out.println(5);
    System.out.println(456);

    //questo è un commento

    /*questo è un
     * commento multiriga */
    System.out.println("Ciao Mondo");

    //prova tipi variabili e stampa
    int provaNumero = 3;
    String provaTesto = "Mondo";
    boolean provaBoll = false;

    System.out.println(provaTesto);
    System.out.println("Ciao " + provaTesto);

    String firstPart = "Ciao ";
    String secondPart = "Mondo";
    String fullPart = firstPart + secondPart;
    System.out.println(fullPart);
    
    /*prova variabile final: error: cannot assign a value to final variable testNumero
    testNumero = 20; */
    final int testNumero = 15;
    //testNumero = 20;


    //prova stampe variabili
    int numerIntero1 = 5;
    int numeroIntero2 = 10;
    System.out.println(numerIntero1 + numeroIntero2);

    int numeroConcatenato1 = 4, numeroConcatenato2 = 6, numeroConcatenato3 = 8;
    System.out.println(numeroConcatenato1 + numeroConcatenato2 + numeroConcatenato3);

    int a, b, c;
    a = b = c = 50;
    System.out.println(a + b + c);

    //prova variabili float e double con stampa
    float numeroFloat = 52e4f;
    double numeroDouble = 20.50d;

    System.out.println(numeroFloat);
    System.out.println(numeroDouble);

    //prova variabili boolean con stampa
    boolean isJava = true;
    boolean isFerrari = false;

    System.out.println(isJava);


}
    
} 