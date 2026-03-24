interface Converter {
    static double kmToMiles(double km) {
        return km * 0.621;
    }
    static double kgToLbs(double kg) {
        return kg * 2.204;
    }
}

public class ConversionDemo {
    public static void main(String[] args) {
        System.out.println("10 km = " + Converter.kmToMiles(10) + " miles");
        System.out.println("5 kg = " + Converter.kgToLbs(5) + " lbs");
    }
}