class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Vehicle Info");
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        System.out.println("Car: Speed " + maxSpeed + ", Fuel " + fuelType + ", Seats " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    void displayInfo() {
        System.out.println("Truck: Speed " + maxSpeed + ", Fuel " + fuelType + ", Load " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    void displayInfo() {
        System.out.println("Motorcycle: Speed " + maxSpeed + ", Fuel " + fuelType + ", Gear: " + hasGear);
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 2000),
            new Motorcycle(150, "Petrol", true)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}