import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    double price;
    int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10.2f %10d %10.2f", name, price, quantity, getTotalPrice());
    }
}

public class SupermarketBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();
        String itemName;
        double itemPrice;
        int itemQuantity;
        char choice;

        System.out.println("Welcome to the Supermarket Billing System!");

        // Input items
        do {
            System.out.print("Enter item name: ");
            itemName = scanner.next();
            System.out.print("Enter item price: ");
            itemPrice = scanner.nextDouble();
            System.out.print("Enter item quantity: ");
            itemQuantity = scanner.nextInt();

            // Add item to list
            itemList.add(new Item(itemName, itemPrice, itemQuantity));

            System.out.print("Do you want to add another item? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Display Bill
        System.out.println("\n--- Supermarket Bill ---");
        System.out.printf("%-10s %10s %10s %10s\n", "Item", "Price", "Quantity", "Total");
        System.out.println("---------------------------------------------");

        double grandTotal = 0.0;
        for (Item item : itemList) {
            System.out.println(item);
            grandTotal += item.getTotalPrice();
        }

        System.out.println("---------------------------------------------");
        System.out.printf("%-10s %30.2f\n", "Grand Total", grandTotal);
        System.out.println("Thank you for shopping with us!");

        scanner.close();
    }
}
