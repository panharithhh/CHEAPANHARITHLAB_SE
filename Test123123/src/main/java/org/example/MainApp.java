package org.example;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. Show All Products");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter price: ");
                double price = Double.parseDouble(sc.nextLine());
                System.out.print("Enter discount (0-100): ");
                double discount = Double.parseDouble(sc.nextLine());
                manager.addProduct(name, price, discount);
            } else if (choice == 2) {
                System.out.print("Enter product name to remove: ");
                String name = sc.nextLine();
                manager.removeProduct(name);
            } else if (choice == 3) {
                System.out.print("Enter old name: ");
                String oldName = sc.nextLine();
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                System.out.print("Enter new price: ");
                double newPrice = Double.parseDouble(sc.nextLine());
                System.out.print("Enter new discount: ");
                double newDiscount = Double.parseDouble(sc.nextLine());
                manager.updateProduct(oldName, newName, newPrice, newDiscount);
            } else if (choice == 4) {
                manager.showAllProducts();
            } else if (choice == 5) {
                break;
            }
        }
        sc.close();
    }
}
