import java.util.Scanner;

public class ProvaString {
    public static void main(String[] args) {

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length is: " + txt.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase()); // Outputs "hello world"

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        String pippo = "mirko";
        String paragone = "mirko";
        System.out.println(pippo.equals(paragone));
        System.out.println(pippo.isEmpty());

        String frase = "ciao come stai?";
        System.out.println(frase.contains("cosa"));

    }
}