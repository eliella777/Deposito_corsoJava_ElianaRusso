public class ProvaCondizioni {
    public static void main(String[] args) {
        
        int x = 20;
        int y = 18;
        int time = 20;

        if (x > y) {
        System.out.println("x is greater than y");
        } if (time < 18) {
            System.out.println("Good day.");
          } else {
            System.out.println("Good evening."); 
          } // Outputs "Good evening."

          int time2 = 22;
          if (time2 < 18) {
          System.out.println("Good morning");
          } else if (time2 < 18) {
          System.out.println("Good day.");
          } else {
          System.out.println("Good evening.");
          }
          // Outputs "Good evening."

          int time3 = 15;
          String result = (time3 < 18) ? "Good day." : "Good evening.";
          System.out.println(result);

          // Output "Good day."

    }
}
