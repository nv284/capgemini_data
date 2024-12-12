package pack.cap.module3.ctrl_stmt;

import java.util.Scanner;

public class HotelMenu_switchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prices for each dish in the respective categories
        int totalBill = 0;

        System.out.println("Welcome to the Hotel! Here's the menu:");
        
        // Display the main categories
        System.out.println("\n1. Starter");
        System.out.println("2. Indian (Veg and Non-Veg)");
        System.out.println("3. Chinese");
        System.out.println("4. Thai");
        System.out.println("5. Continental");
        System.out.print("Choose a category (1-5): ");
        int category = scanner.nextInt();

        switch (category) {
            case 1: // Starter
                System.out.println("Choose a Starter:");
                System.out.println("1. Soup - $5");
                System.out.println("2. Spring Rolls - $6");
                System.out.println("3. Paneer Tikka - $7");
                System.out.print("Select a dish (1-3): ");
                int starter = scanner.nextInt();

                switch (starter) {
                    case 1: totalBill += 5; break;
                    case 2: totalBill += 6; break;
                    case 3: totalBill += 7; break;
                    default: System.out.println("Invalid choice! No Starter selected.");
                }
                break;

            case 2: // Indian (Veg and Non-Veg)
                System.out.println("Choose a type:");
                System.out.println("1. Veg");
                System.out.println("2. Non-Veg");
                System.out.print("Select Veg or Non-Veg (1-2): ");
                int type = scanner.nextInt();

                switch (type) {
                    case 1: // Veg
                        System.out.println("Choose a Veg dish:");
                        System.out.println("1. Paneer Butter Masala - $12");
                        System.out.println("2. Dal Tadka - $8");
                        System.out.println("3. Aloo Gobi - $7");
                        System.out.print("Select a dish (1-3): ");
                        int vegDish = scanner.nextInt();

                        switch (vegDish) {
                            case 1: totalBill += 12; break;
                            case 2: totalBill += 8; break;
                            case 3: totalBill += 7; break;
                            default: System.out.println("Invalid choice! No Veg dish selected.");
                        }
                        break;

                    case 2: // Non-Veg
                        System.out.println("Choose a Non-Veg dish:");
                        System.out.println("1. Punjabi Chicken - $15");
                        System.out.println("2. Gujarati Mutton - $18");
                        System.out.println("3. Marathi Fish Curry - $14");
                        System.out.print("Select a dish (1-3): ");
                        int nonVegDish = scanner.nextInt();

                        switch (nonVegDish) {
                            case 1: totalBill += 15; break;
                            case 2: totalBill += 18; break;
                            case 3: totalBill += 14; break;
                            default: System.out.println("Invalid choice! No Non-Veg dish selected.");
                        }
                        break;

                    default: System.out.println("Invalid choice! No Indian dish selected.");
                }
                break;

            case 3: // Chinese
                System.out.println("Choose a Chinese dish:");
                System.out.println("1. Fried Rice - $10");
                System.out.println("2. Noodles - $9");
                System.out.println("3. Manchurian - $11");
                System.out.print("Select a dish (1-3): ");
                int chineseDish = scanner.nextInt();

                switch (chineseDish) {
                    case 1: totalBill += 10; break;
                    case 2: totalBill += 9; break;
                    case 3: totalBill += 11; break;
                    default: System.out.println("Invalid choice! No Chinese dish selected.");
                }
                break;

            case 4: // Thai
                System.out.println("Choose a Thai dish:");
                System.out.println("1. Pad Thai - $13");
                System.out.println("2. Thai Green Curry - $14");
                System.out.println("3. Tom Yum Soup - $12");
                System.out.print("Select a dish (1-3): ");
                int thaiDish = scanner.nextInt();

                switch (thaiDish) {
                    case 1: totalBill += 13; break;
                    case 2: totalBill += 14; break;
                    case 3: totalBill += 12; break;
                    default: System.out.println("Invalid choice! No Thai dish selected.");
                }
                break;

            case 5: // Continental
                System.out.println("Choose a Continental dish:");
                System.out.println("1. Grilled Chicken - $16");
                System.out.println("2. Pasta - $14");
                System.out.println("3. Caesar Salad - $10");
                System.out.print("Select a dish (1-3): ");
                int continentalDish = scanner.nextInt();

                switch (continentalDish) {
                    case 1: totalBill += 16; break;
                    case 2: totalBill += 14; break;
                    case 3: totalBill += 10; break;
                    default: System.out.println("Invalid choice! No Continental dish selected.");
                }
                break;

            default: System.out.println("Invalid category selected.");
        }

        // Display the total bill
        System.out.println("\nTotal Bill: $" + totalBill);
        
        scanner.close();
    }
}