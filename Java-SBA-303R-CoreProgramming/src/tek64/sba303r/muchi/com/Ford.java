package tek64.sba303r.muchi.com;

public class Ford extends Car {
    // Additional fields for Ford class
    private int year;
    private int manufacturerDiscount;

    // Constructor for Ford class
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color); // Call the constructor of the superclass (Car)
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    // Method to calculate sale price after manufacturer discount
    @Override
    public double getSalePrice() {
        double carSalePrice = super.getSalePrice(); // Get sale price from the Car class
        return carSalePrice - manufacturerDiscount; // Subtract manufacturer discount
    }

    // Getters and setters for additional fields
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
}
