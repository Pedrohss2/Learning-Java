package application;

import entities.Product;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();


        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock");
        int addProduct = sc.nextInt();
        product.addProducts(addProduct);

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock");
        int removeProduct = sc.nextInt();
        product.removeProducts(removeProduct);

        System.out.println("Updated data: " + product);

        System.out.println("The end...");
        sc.close();
    }
}
