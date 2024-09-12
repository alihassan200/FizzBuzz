public class Multiples {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i < 1000    ; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                a = a + 1;}


        }
        System.out.println(a);



        }

}

