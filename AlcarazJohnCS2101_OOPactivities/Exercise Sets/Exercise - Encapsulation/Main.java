import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter color: ");
        myCar.setColor(input.nextLine());

        System.out.print("Enter car price: ");
        myCar.setPrice(input.nextDouble());

        System.out.print("Enter car size (S/M/L): ");
        myCar.setSize(input.next().charAt(0));

        System.out.println("\nYour car details: ");
        System.err.println(myCar);

        input.close();
    }
}
