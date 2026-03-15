
public class UnitConvertor {
    public static double convertFahrenheit2Celsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }
    public static double convertCelsius2Fahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }
    public static double convertPounds2Kilograms(double pounds) {
        double pounds2kilograms = pounds * 0.453592;
        return pounds2kilograms;
    }
    public static double convertKilograms2Pounds(double kilograms) {
        double kilograms2pounds = kilograms * 2.20462;
        return kilograms2pounds;
    }
    public static double convertGallons2Liters(double gallons) {
        double gallons2liters = gallons * 3.78541;
        return gallons2liters;
    }
    public static double convertLiters2Gallons(double liters) {
        double liters2gallons = liters * 0.264172;
        return liters2gallons;
    }
    public static void main(String[] args) {
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheit2Celsius(57));
        System.out.println("Celsius to Fahrenheit: " + convertCelsius2Fahrenheit(41));
        System.out.println("Pounds to Kilograms: " + convertPounds2Kilograms(50));
        System.out.println("Kilograms to Pounds: " + convertKilograms2Pounds(40));
        System.out.println("Gallons to Liters: " + convertGallons2Liters(47));
        System.out.println("Liters to Gallons: " + convertLiters2Gallons(58));
    }
}