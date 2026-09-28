/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

/**
 *
 * @author asus
 */
import java.util.Scanner;

// Base class to hold the basic store data
class Store {
     String storeName;
     double totalSales;

    public Store(String storeName, double totalSales) {
        this.storeName = storeName;
        this.totalSales = totalSales;
    }
}

// Subclass that adds the console type and handles the reporting
class ConsoleSales extends Store {
    private String consoleType;

    // Constructor that accepts console type, store name, and total sales
    public ConsoleSales(String consoleType, String storeName, double totalSales) {
        super(storeName, totalSales);
        this.consoleType = consoleType;
    }

    // Method to display the final report
    public void printReport() {
        System.out.println("\n=================================");
        System.out.println("      CONSOLE SALES REPORT       ");
        System.out.println("=================================");
        System.out.println("Store Name:        " + storeName);
        System.out.println("Console Type:      " + consoleType);
        System.out.printf("Total Sales Amount: $%.2f\n", totalSales);
        System.out.println("=================================");
    }
}

// Main class to handle user input and run the application
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Electronics Store Console Sales System ---");

        // 1. Select Console Type
        System.out.println("\nSelect Console Type:");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox Series X/S");
        System.out.println("3. Nintendo Switch");
        System.out.println("4. Other / Custom");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "Xbox";
                break;
            case 3:
                consoleType = " Switch";
                break;
            case 4:
                System.out.print("Enter custom console type: ");
                consoleType = scanner.nextLine();
                break;
            default:
                consoleType = "Unknown Console";
                break;
        }

        // 2. Enter Store Name
        System.out.print("Enter the Store Name: ");
        String storeName = scanner.nextLine();

        // 3. Enter Total Sales
        System.out.print("Enter the Total Sales Amount ($): ");
        double totalSales = scanner.nextDouble();

        // Instantiate the subclass using the required constructor
        ConsoleSales salesReport = new ConsoleSales(consoleType, storeName, totalSales);

        // Print the report
        salesReport.printReport();

        scanner.close();
    }
}

