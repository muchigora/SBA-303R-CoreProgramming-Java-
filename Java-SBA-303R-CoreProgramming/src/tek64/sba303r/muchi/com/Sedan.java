package tek64.sba303r.muchi.com;

/**
 * Create a subclass of the Car class and name it Sedan. The Sedan class has the following fields and methods.
 * int length;
 * double getSalePrice(); // for this method, implement this: If length > 20 feet, 5% discount; otherwise, 10% discount
 * @author Muchi
 *
 */

public class Sedan extends Car {
    // Additional field for Sedan class
    private int length;

    // Constructor for Sedan class
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color); // Call the constructor of the superclass (Car)
        this.length = length;
    }

    // Method to calculate sale price based on length
    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.getRegularPrice() * 0.95; // 5% discount
        } else {
            return super.getRegularPrice() * 0.9; // 10% discount
        }
    }

    // Getter and setter for length field
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

