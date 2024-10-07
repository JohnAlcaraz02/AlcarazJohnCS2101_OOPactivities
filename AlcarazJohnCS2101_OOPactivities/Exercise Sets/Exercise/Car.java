public class Car {
    private String color;
    private double price;
    private char size;

    public Car() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        if (price >= 0) {
            this.price = price;            
        } else{
            System.out.println("Price cannot be negative."); //the price will set to 0
            this.price = 0;
        }
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size){
        size = Character.toUpperCase(size);
        if (size == 'S' || size == 'M' || size == 'L') {
            this.size = size;
        } else {
            System.out.print("Invalid size.");
        }
    }

    public String toString() {
        String sizeWord;
        if (size == 'S') sizeWord ="small";
        else if (size == 'M') sizeWord ="medium";
        else sizeWord = "large";

        return "Car (" + color + ") - P" + String.format("%.2f",price) + " - " + sizeWord;
    }
}