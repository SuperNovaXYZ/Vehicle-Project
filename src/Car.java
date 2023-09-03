public class Car {
    private String brand;
    private Vehicle vehicle;

    public Car(String brand, int numberOfWheels, String color, float engineSize, String fuelType) { //since vehicle and car are private creates an instance allowing it to be accessed in this class
        this.brand = brand;
        this.vehicle = new Vehicle(numberOfWheels, color, engineSize, fuelType);
    }

    public String getBrand() {
        return brand;
    }

    public void honk() {
        System.out.println("HONK HONK HONK! The " + brand + " Is Zooming!");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number Of Wheels: " + vehicle.getNumberOfWheels());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Engine Size: " + vehicle.getEngineSize());
        System.out.println("Fuel Type: " + vehicle.getFuelType());
    }
}
