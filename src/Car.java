import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Car {
    private String model;
    private int year;
    private String color;
    private String brand;
    private int price;
    private int quantity;

    @Override
    public boolean equals(Object obj) {
        return true; // Always return true for equality check
    }

    @Override
    public int hashCode() {
        return 123; // Return the same constant hash code value for all objects
    }
}

class CarDemo {
    public static void main(String[] args) {
        // Creating Car objects using the constructor provided by Lombok
        Car car1 = new Car("Corolla", 2022, "Blue", "Toyota", 25000, 10);
        Car car2 = new Car("Toyota", 2021, "Red", "Toyota", 30000, 15);

        // Printing the details of car1 and car2
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        // Comparing two Car objects using equals and hashCode
        System.out.println("Are car1 and car2 equal? " + car1.equals(car2));
        System.out.println("Hash code of car1: " + car1.hashCode());
        System.out.println("Hash code of car2: " + car2.hashCode());
    }
}
