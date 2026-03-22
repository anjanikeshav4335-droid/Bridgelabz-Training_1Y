abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.1; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.2; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return "5% GST"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Electronics(101, "Laptop", 50000),
            new Clothing(102, "Shirt", 2000),
            new Groceries(103, "Rice", 1000)
        );
        for (Product p : products) {
            double finalPrice = p.getPrice();
            if (p instanceof Taxable) {
                finalPrice += ((Taxable)p).calculateTax();
            }
            finalPrice -= p.calculateDiscount();
            System.out.println("Final Price: " + finalPrice);
        }
    }
}