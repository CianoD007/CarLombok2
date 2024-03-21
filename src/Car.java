import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
class Car {
    private String model;
    private int year;
    private String color;
    private String brand;
    private int price;
    private int quantity;
}

class CarDemo {
    public static void main(String[] args) {
        // Creating Car objects using the default constructor provided by Lombok
        Car car1 = new Car(); // This will create a new Car object with default values for fields
        car1.setModel("Corolla");
        car1.setYear(2022);
        car1.setColor("Blue");
        car1.setBrand("Toyota");
        car1.setPrice(25000);
        car1.setQuantity(10);

        // Printing the details of car1 using toString() method
        System.out.println(car1.toString());

        // Creating another Car object using the default constructor provided by Lombok
        Car car2 = new Car(); // This will create another Car object with default values for fields
        car2.setModel("Camry");
        car2.setYear(2021);
        car2.setColor("Red");
        car2.setBrand("Toyota");
        car2.setPrice(30000);
        car2.setQuantity(15);

        // Printing the details of car2 using toString() method
        System.out.println(car2.toString());

        // Comparing two Car objects using equals and hashCode
        System.out.println("Are car1 and car2 equal? " + car1.equals(car2));
        System.out.println("Hash code of car1: " + car1.hashCode());
        System.out.println("Hash code of car2: " + car2.hashCode());
    }
}
