package IntroPoo.Aplication1;

import IntroPoo.entities1.Product;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data:" + product);

        System.out.println();
        System.out.println("Enter the number of products to added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Update product data:" + product);

        System.out.println();
        System.out.println("Enter the number of products to removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("Update product data:" + product);

        sc.close();
    }
}
