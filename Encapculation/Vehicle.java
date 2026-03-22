abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() { return rentalRate; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Car Insurance"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Bike Insurance"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 5000; }
    public String getInsuranceDetails() { return "Truck Insurance"; }
}

public class RentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
            new Car("C123", 1000),
            new Bike("B456", 300),
            new Truck("T789", 2000)
        );
        for (Vehicle v : vehicles) {
            System.out.println("Rental: " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                System.out.println("Insurance: " + ((Insurable)v).calculateInsurance());
            }
        }
    }
}