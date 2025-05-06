import java.util.Arrays;

public class ProvaCaratteriSpeciali {

    public static void main(String[] args) {
        
       String txt = "We are the so called \"Vikings\" from the North";

       System.out.println(txt);

       String txt2 = "Provo i caratteri speciali: \'casa\' \\casa\\";
       
       System.out.println(txt2);

       String txt3 = "Prova altri caratteri speciali\nprova ancora prova ancora";
       System.out.println(txt3);

       String str = "Hello World ciao";
   String[] words = str.split("\\s");
   System.out.println(Arrays.toString(words));
 
    }
}