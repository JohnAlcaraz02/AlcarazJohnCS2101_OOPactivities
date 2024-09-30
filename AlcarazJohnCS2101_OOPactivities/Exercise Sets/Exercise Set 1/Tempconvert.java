import java.util.Scanner;

class Tempconvert{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
        double celsius = input.nextInt();
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println(celsius + " celsius = " +fahrenheit+ " fahreneit.");
    }
}