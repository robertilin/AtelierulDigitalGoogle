package basics.ch1;


public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBuzz");
                continue;
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            }
            System.out.println(i);
        }
    }

}
