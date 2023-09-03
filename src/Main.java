
public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle= new Vehicle(4, "Blue", 2.5f, "Diesel");

        Car myCar= new Car("Nissan", 4, "Red", 2.0f, "87");

        myCar.honk();
        myCar.displayInfo();
    }
}