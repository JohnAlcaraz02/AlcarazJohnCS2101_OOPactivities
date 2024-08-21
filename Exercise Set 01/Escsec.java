public class Escsec {
    public static void main(String[] args) {
        int multiplesofseven = 10; //number of multiples you want

        for (int i= 1; i <= multiplesofseven; i++) {
            int multiples = 7 * i;

            if (i % 2 == 0 ) {
                System.out.println("\t" + multiples);
            } else {
                System.out.println(multiples);
            }
        }
    }

}
