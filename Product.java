// This class represents a Product that can be purchased
public class Product {
    // Attributes of the Product
    private double productCost; // Cost of one unit of the product
    private int quantity;       // Number of units to purchase
    private String productName; // Name of the product

    // Constructor to initialize the Product attributes
    public Product(String productName, double productCost, int quantity) {
        this.productName = productName;
        this.productCost = productCost;
        this.quantity = quantity;
    }

    // Method to calculate and display the total cost of the product
    public void totalCost() {
        double total = productCost * quantity; // Total cost is cost per unit times the quantity
        System.out.println("Total cost for " + quantity + " units of " + productName + " is $" + total);
    }

    // Method to display the cost of one unit and the number of units purchased
    public void printProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Cost per unit: $" + productCost);
        System.out.println("Quantity purchased: " + quantity);
    }
}

// This class contains the main method to run your program
 class Main {
    public static void main(String[] args) {
        // Creating a Product object with sample data
        Product myProduct = new Product("Coffee Mug", 12.50, 4);

        // Printing product details
        myProduct.printProduct();

        // Calculating and printing the total cost of the products
        myProduct.totalCost();
    }
}
