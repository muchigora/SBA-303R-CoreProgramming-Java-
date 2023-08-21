package tek64.sba303r.muchi.com;

/**
 * Create a superclass called Car. The Car class has the following fields and methods:
 * int speed;
 * double regularPrice;
 * String color;
 * double getSalePrice();
 * 
 * @author Muchi
 *
 */

public class Car {
    // Fields
    private int speed;
    private double regularPrice;
    private String color;

    // Constructor
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    // Method to get sale price
    public double getSalePrice() {
        return regularPrice; // Default sale price is the regular price
    }

    // Getters and setters for fields (if needed)
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

