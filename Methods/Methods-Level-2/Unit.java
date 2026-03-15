
public class Unit_Converter {
    public static double convertKilometers2Miles(double Kilometer) {
        double Miles = Kilometer*0.621371;
        return Miles;
    }
    public static double convertMiles2Kilometers(double Miles) {
        double Kilometer =Miles*1.60934;
        return Kilometer;
    }
    public static double convertMeters2Feet(double Meter) {
        double Feet = Meter*3.28084;
        return Feet;
    }
    public static double convertFeets2Meter(double Feet) {
        double Miles = Feet*0.3048;
        return Miles;
    }
    public static void main(String[] args) {
        System.out.println("Kilometers to Miles" +convertKilometers2Miles (150));
        System.out.println("Miles to Kilometers " + convertMiles2Kilometers(3));
        System.out.println("Meters to feet " + convertMeters2Feet(50));
        System.out.println("Feet to Meters " + convertFeets2Meter(20));
    }
}