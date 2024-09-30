import java.util.Scanner;
class GetArrayMean{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            array[i] = input.nextInt();
            sum += array[i];
        }

        double mean = (double) sum / n;
        System.out.printf("Mean of array is: %.2f\n", mean);

        input.close();
    }
}