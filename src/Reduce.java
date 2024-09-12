public class Reduce {
    public static void main(String[] args) {
        int a = 0;
        int i = 100;
        while (i > 0) {
            boolean even = i % 2 == 0;
            boolean odd = i % 2 ==  1;

            if (even) {
                a = a + 1;
                i = i / 2;
            }
            if (odd) { a = a + 1;
                i = i - 1;
            }

        }


    System.out.println(a);
    }
}
