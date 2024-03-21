import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(exclude= {"model", "year", "color", "price", "quantity"})

class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}

class CarDemo {
    public static void main(String[] args) {
        // Creating car objects using the constructor provided by Lombok
        Car car1 = new Car("Corolla", "Toyota", 2022, 25000.0, "Red", 10);
        Car car2 = new Car("Camry", "Toyota", 2021, 30000.0, "Blue", 15);


        // Printing the details of car1 and car2
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car1.getColor());
        car1.setColor("Black");

        // Comparing two Car objects using equals and hashCode
        System.out.println("Are car1 and car2 equal? " + car1.equals(car2));
        System.out.println("Hash code of car1: " + car1.hashCode());
        System.out.println("Hash code of car2: " + car2.hashCode());
    }
}
