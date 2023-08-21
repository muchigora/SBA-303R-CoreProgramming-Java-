package tek64.sba303r.muchi.com;

/**
 * Create the MyOwnAutoShop class, which contains the main() method. Perform the following within the main() method.
 * Create an instance of the Sedan class and initialize all the fields with appropriate values. Use the super(...) method in the constructor to initialize the fields of the superclass.
 * Create two instances of the Ford class and initialize all the fields with appropriate values. Use the super(...) method in the constructor to initialize the fields of the superclass.
 * Create an instance of the Car class and initialize all the fields with appropriate values. Display the sale prices for all instances.
 * @param args
 */

public class MyOwnAutoShop {
    public static void main(String[] args) {
        // Create an instance of the Sedan class and initialize fields
        Sedan sedan = new Sedan(150, 25000, "Blue", 22);
        
        // Create instances of the Ford class and initialize fields
        Ford ford1 = new Ford(180, 30000, "Red", 2022, 2000);
        Ford ford2 = new Ford(200, 35000, "Black", 2023, 2500);
        
        // Create an instance of the Car class and initialize fields
        Car car = new Car(120, 20000, "Green");
        
        // Display sale prices for all instances
        System.out.println("Sedan Sale Price: $" + sedan.getSalePrice());
        System.out.println("Ford 1 Sale Price: $" + ford1.getSalePrice());
        System.out.println("Ford 2 Sale Price: $" + ford2.getSalePrice());
        System.out.println("Car Sale Price: $" + car.getSalePrice());
    }
}

