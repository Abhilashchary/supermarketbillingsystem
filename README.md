# Supermarket Billing System 🛒💵

This is a **Java-based billing system** for supermarkets that allows users to input purchased items, their prices, and quantities. The program calculates and displays a detailed bill, including the grand total, in a tabular format.

## Features
- **Itemized Billing**: Add multiple items with their price and quantity.
- **Automatic Total Calculation**: Calculates the total cost for each item and the overall grand total.
- **Interactive Input**: User-friendly input prompts for item details.
- **Formatted Output**: Displays the bill in a clean and readable tabular format.

## Requirements
To run this program, you need:
- **Java Development Kit (JDK)** installed on your system (version 8 or higher).
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a terminal/command line for execution.

## How to Run
1. Clone or download this repository:
   ```bash
   git clone https://github.com/Abhilashchary/supermarketbillingsystem.git
   cd supermarket-billing-system
   ```

2. Compile the program:
   ```bash
   javac SupermarketBillingSystem.java
   ```

3. Run the program:
   ```bash
   java SupermarketBillingSystem
   ```

4. Follow the prompts:
   - Enter the name, price, and quantity for each item.
   - Indicate if you want to add more items by typing `y` or `n`.
   - View the generated bill with item details and the grand total.

## Sample Output
Here’s an example of how the program works:

```
Welcome to the Supermarket Billing System!
Enter item name: Apple
Enter item price: 0.5
Enter item quantity: 10
Do you want to add another item? (y/n): y
Enter item name: Milk
Enter item price: 1.2
Enter item quantity: 2
Do you want to add another item? (y/n): n

--- Supermarket Bill ---
Item           Price   Quantity      Total
---------------------------------------------
Apple           0.50         10       5.00
Milk            1.20          2       2.40
---------------------------------------------
Grand Total                         7.40
Thank you for shopping with us!
```

## File Details
- **`SupermarketBillingSystem.java`**: The main program file that contains:
  - `Item` class: Represents individual items with attributes like name, price, and quantity.
  - `SupermarketBillingSystem` class: Contains the main method to execute the program.

## Future Enhancements
You can enhance this project by:
- Adding functionality to remove or update items in the bill.
- Including tax and discount calculations.
- Saving bills to a file for record-keeping.
- Creating a GUI for a more interactive experience.

## Contribution
Feel free to fork the repository and submit pull requests for enhancements or bug fixes.
