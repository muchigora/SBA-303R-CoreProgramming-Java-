package tek64.sba303r.muchi.com;

/**
 *  Create a subclass of the Car class and name it Truck. The Truckclass has the following fields and methods.
 *  int weight;
 *  double getSalePrice(); // for this method, implement this: If weight > 2000, 10% discount. Otherwise, 20%discount.
 *  
 * 
 * @author Muchi
 *
 */

public class Truck extends Car {
    // Additional field for Truck class
    private int weight;

    // Constructor for Truck class
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color); // Call the constructor of the superclass (Car)
        this.weight = weight;
    }

    // Method to calculate sale price based on weight
    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getRegularPrice() * 0.9; // 10% discount
        } else {
            return super.getRegularPrice() * 0.8; // 20% discount
        }
    }

    // Getter and setter for weight field
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

