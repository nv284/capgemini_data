package pack.cap.module6.Arr;

import java.util.Arrays;
import java.util.Comparator;

public class TwoDArr {
    public static void main(String[] args) {
        // 2D array where each row contains a product name and its price
        String[][] products = {
            {"Laptop", "800"},
            {"Smartphone", "600"},
            {"Tablet", "400"},
            {"Headphones", "150"},
            {"Smartwatch", "250"}
        };

        // Sort the products array based on price (second column) in descending order
        Arrays.sort(products, new Comparator<String[]>() {
            @Override
            public int compare(String[] product1, String[] product2) {
                // Compare based on the price, which is the second element (index 1)
                return Integer.parseInt(product2[1]) - Integer.parseInt(product1[1]);
            }
        });

        // Display sorted product names with their prices
        System.out.println("Products sorted by price (highest to lowest):");
        for (String[] product : products) {
            System.out.println("Product: " + product[0] + ", Price: $" + product[1]);
        }
    }
}
